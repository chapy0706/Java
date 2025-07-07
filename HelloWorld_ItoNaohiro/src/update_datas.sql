-- トランザクション開始
BEGIN;

-- update store data
UPDATE store
SET delete_flag = 1,
    updated_at = now()
WHERE store_code = 'ST028';

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;

-- 確認用SQL
-- SELECT * FROM store WHERE store_code = 'ST028';

-- トランザクション開始
BEGIN;

-- update product data 1
UPDATE product
SET product_price = 1500,
    updated_at = now()
WHERE product_name = '新鮮野菜セット';

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;

-- 確認用SQL
-- SELECT * FROM product WHERE product_name = '新鮮野菜セット';

-- トランザクション開始
BEGIN;

-- update product data 2
UPDATE product
SET stock_quantity = 50,
    updated_at = now()
WHERE category_id = (
    SELECT category_id
    FROM product_category
    WHERE category_name = 'お菓子'
)
AND store_code = 'ST013';

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;

-- 確認用SQL
-- SELECT * FROM product
-- WHERE category_id = (
--     SELECT category_id
--     FROM product_category
--     WHERE category_name = 'お菓子'
-- )
-- AND store_code = 'ST013';
