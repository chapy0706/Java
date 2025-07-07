-- トランザクション開始
BEGIN;

INSERT INTO facility (facility_code, facility_name, created_at, updated_at) VALUES ('FA001', 'レストルーム', now(), NULL);
INSERT INTO facility (facility_code, facility_name, created_at, updated_at) VALUES ('FA002', '授乳室・おむつ交換台', now(), NULL);
INSERT INTO facility (facility_code, facility_name, created_at, updated_at) VALUES ('FA003', '公衆電話', now(), NULL);
INSERT INTO facility (facility_code, facility_name, created_at, updated_at) VALUES ('FA004', '休憩スペース', now(), NULL);
INSERT INTO facility (facility_code, facility_name, created_at, updated_at) VALUES ('FA005', '喫煙所', now(), NULL);

-- ロールバック処理動作確認
-- ROLLBACK;

-- コミット処理(トランザクション終了)
COMMIT;