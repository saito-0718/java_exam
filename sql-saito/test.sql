--Q1
INSERT INTO items(id,category_id,name,price)
VALUES(13,1,'鰯',150);

INSERT INTO items(id,category_id,name,price)
VALUES(14,2,'羊',650);


--Q2
UPDATE items
SET price = price  * 0.9;


--Q3
DELETE FROM employees
WHERE end_date <= '2013-3-31';


--Q4 ほかにやり方がありそうだけどわからなかったのでこれ
SELECT * FROM employees
WHERE end_date IS NULL
ORDER BY start_date
LIMIT 1;

--Q5 順番にならない
SELECT r.name region , p.name prefecture
FROM prefectures p
JOIN regions r
ON p.region_code = r.code
GROUP BY region,prefecture
ORDER BY region,prefecture;
-- 順番になるけど余計なカラムが出る↓
-- SELECT r.name region , p.name prefecture,r.code,p.code
-- FROM prefectures p
-- JOIN regions r
-- ON p.region_code = r.code
-- GROUP BY r.code,p.code
-- ORDER BY r.code ,p.code



--Q6
SELECT SUM(population) population FROM populations;


--Q7 順番にならない
SELECT  pre.name prefecture,ge.name gender,SUM(population)
FROM populations po
JOIN prefectures pre
ON po.prefecture_code = pre.code
JOIN regions re 
ON pre.region_code = re.code
JOIN genders ge
ON po.gender_code = ge.code
WHERE re.name = '九州'
GROUP BY gender,prefecture
ORDER BY prefecture;


--Q8 行持ちから列持ちにできない
SELECT re.name region,
gene.label genelabel,
gender.name gendername,
sum(po.population)
FROM populations po
JOIN generations gene
ON po.generation_code = gene.code
JOIN prefectures pre
ON po.prefecture_code = pre.code
JOIN regions re
ON pre.region_code = re.code
JOIN genders gender
ON po.gender_code = gender.code
GROUP BY region,genelabel,gendername
ORDER BY region,genelabel;
