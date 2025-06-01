-- Q1 全選手の指定データ(背番号,名前,所属クラブ)抽出
SELECT  uniform_num, name, club
FROM players;

-- Q2 グループCに所属する国を抽出
SELECT  *
FROM countries
WHERE group_name = 'C';

-- Q3 グループC以外に所属する国を抽出
SELECT  *
FROM countries
WHERE group_name != 'C';

-- Q4 グループC以外に所属する国を抽出（条件式は再検討が必要）
SELECT  *
FROM players
WHERE EXTRACT(YEAR FROM birth) <= (2025 - 40);

-- Q5 身長が 170cm 未満の選手を抽出
SELECT  *
FROM players
WHERE height < 170;

-- Q6 ランクが日本の前後 10 位に該当する国の抽出（BETWEEN 句）
SELECT  *
FROM countries
WHERE ranking BETWEEN 36 and 56;

-- Q7 選手のポジションが GK、DF、MF に該当する選手の抽出（IN 句）
SELECT  *
FROM players
WHERE position IN ('GK','DF','MF');

-- Q8 オウンゴールとなったゴールを抽出
SELECT  *
FROM goals
WHERE player_id IS NULL;

-- Q9 オウンゴール以外となったゴールを抽出
SELECT  *
FROM goals
WHERE player_id IS NOT NULL;

-- Q10 名前の末尾が「ニョ」で終わるプレイヤーの抽出
SELECT  *
FROM players
WHERE name LIKE ('%ニョ');

-- Q11 名前の中に「ニョ」が含まれるプレイヤーの抽出
SELECT  *
FROM players
WHERE name LIKE ('%ニョ%');

-- Q12 全選手の中から小柄な選手（身長が 165cm 未満か、体重が 60kg 未満）の抽出
SELECT  *
FROM players
WHERE height < 165
OR weigh < 60;

-- Q13 FW か MF の中で 170 未満の選手を抽出(OR と AND)
SELECT  *
FROM players
WHERE 
(position = 'FW' 
OR position = 'DF')
AND height < 170;

-- Q14 ポジションの一覧を重複なしで表示
SELECT DISTINCT position
FROM players;

-- Q15 全選手の身長と体重を足した値「体力指数」として抽出
SELECT  name, club, height + weight 体力指数
FROM players;

-- Q16 全ての選手を身長の大きい順,体重の重い順に表示
SELECT  *
FROM players
ORDER BY height DESC, weight DESC;

-- Q17 全てのゴール情報を出力(オウンゴールはplayer_id を「9999」と表示）
SELECT 
CASE
  WHEN player_id IS NULL THEN 9999
  ELSE player_id
END AS player_id,
goal_time
FROM goals;

-- Q18 全ての選手の平均身長、平均体重を表示
SELECT AVG(height) AS 平均身長, AVG(weight) AS 体力指数
FROM players;

-- Q19 日本の選手（player_id が 714 から 736）が上げたゴール数を表示
SELECT COUNT(player_id) AS 日本のゴール数
FROM goals
WHERE player_id BETWEEN 714 and 736;

-- Q20 全ての選手の中で最も高い身長と、最も軽い体重を表示
SELECT MAX(height) AS 最大身長, MIN(weight) AS 最小体重
FROM players;

