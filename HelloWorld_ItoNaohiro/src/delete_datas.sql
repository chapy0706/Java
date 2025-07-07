-- トランザクション開始
BEGIN;

-- delete store data
DELETE FROM store
WHERE delete_flag = 1;

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;

-- 確認用SQL
-- SELECT * FROM store WHERE delete_flag = 1;


-- トランザクション開始
BEGIN;

-- delete product data
DELETE FROM product
WHERE category_id = (
    SELECT category_id
    FROM product_category
    WHERE category_name = '小説'
)
AND store_code = 'ST008';

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;

-- 確認用SQL
-- SELECT * FROM product
-- WHERE category_id = (
--     SELECT category_id
--     FROM product_category
--     WHERE category_name = '小説'
-- )
-- AND store_code = 'ST008';
