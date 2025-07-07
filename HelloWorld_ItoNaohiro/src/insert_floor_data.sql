-- トランザクション開始
BEGIN;

INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR001', '1階', '食品、花・ガーデニング', 5, 0, now(), NULL);
INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR002', '2階', '洋服、スーツケース・バッグ', 4, 0, now(), NULL);
INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR003', '3階', '化粧品、コスメ、ジュエリー、ペット用品', 6, 0, now(), NULL);
INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR004', '4階', '家電、電化製品、キッチン用品', 7, 0, now(), NULL);
INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR005', '5階', '家具・インテリア、スポーツ用品', 6, 0, now(), NULL);
INSERT INTO floor (floor_id, floor_name, floor_info, store_count, open_space, created_at, updated_at) VALUES ('FLOOR006', '6階', '本、雑誌、雑貨', 2, 0, now(), NULL);

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;