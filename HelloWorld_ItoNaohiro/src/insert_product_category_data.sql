-- トランザクション開始
BEGIN;

INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (1, '食品', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (2, '洋服', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (3, '化粧品・コスメ', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (4, '家電', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (5, '家具・インテリア', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (6, 'スポーツ用品', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (7, '本・雑誌', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (8, '電化製品', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (9, 'ホームアプライアンス', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (10, 'ジュエリー', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (11, '雑貨', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (12, 'ペット用品', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (13, 'スーツケース・バッグ', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (14, '花・ガーデニング', '店舗商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (15, 'メンズウェア', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (16, 'レディースウェア', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (17, '野菜', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (18, '果物', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (19, 'テレビ・オーディオ', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (20, 'キッチン家電', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (21, '小説', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (22, '雑誌', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (23, '家具', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (24, '寝具', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (25, 'お菓子', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (26, '調味料', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (27, '缶詰', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (28, 'スキンケア', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (29, 'メイクアップ', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (30, 'フィットネス', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (31, 'アウトドア', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (32, 'スマートフォン', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (33, 'カメラ', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (34, 'エアコン', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (35, '掃除機', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (36, 'ネックレス', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (37, 'ブレスレット', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (38, 'キッチン用品', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (39, 'インテリア雑貨', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (40, 'ドッグフード', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (41, 'キャットフード', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (42, 'スーツケース', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (43, 'リュックサック', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (44, 'ガーデン用品', 'メイン商品カテゴリー', now(), NULL);
INSERT INTO product_category (category_id, category_name, explanation, created_at, updated_at) VALUES (45, '冷蔵庫', 'メイン商品カテゴリー', now(), NULL);

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;