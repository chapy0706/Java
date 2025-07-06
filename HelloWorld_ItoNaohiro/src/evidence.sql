-- 1.storeテーブル
SELECT * FROM public.store
ORDER BY store_code ASC;

-- 2.floorテーブル
SELECT * FROM public.floor
ORDER BY floor_id ASC;

-- 3.productテーブル
SELECT * FROM public.product
ORDER BY product_id ASC;

-- 4.product_category
SELECT * FROM public.product_category
ORDER BY category_id ASC;

-- 5.facility
SELECT * FROM public.facility
ORDER BY facility_code ASC;

-- 6.department_store_joinテーブル
SELECT * FROM public.department_store_join
ORDER BY floor_id ASC;
