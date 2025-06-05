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

-- Q4 グループC以外に所属する国を抽出
SELECT  *
FROM players
WHERE birth <= CURRENT_DATE - INTERVAL '40 years';
-- 別解
-- WHERE birth <= 'YYYY-MM-DD'

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

-- Q21 Cグループの FIFA ランクの合計値を表示してください。
SELECT  SUM(ranking) AS CグループのFIFAランクの合計値
FROM countries
WHERE group_name = 'C';

-- Q22 全ての試合の国名と選手名、得点時間を表示(オウンゴールは非表示）
SELECT c.name AS name, p.name AS name, g.goal_time
FROM goals g
JOIN players p
ON g.player_id = p.id
JOIN countries c
ON p.country_id = c.id
WHERE g.player_id IS NOT NULL;

-- Q23 全ての試合の国名と選手名、得点時間を表示(オウンゴールも表示 LEFT JOIN）
SELECT 
g.goal_time AS goal_time, 
p.uniform_num AS uniform_num,
p.position AS position,
p.name AS name
FROM goals g
LEFT JOIN players p
ON g.player_id = p.id;

-- Q24 全ての試合の国名と選手名、得点時間を表示(オウンゴールも表示 RIGHT JOIN）
SELECT 
g.goal_time AS goal_time, 
p.uniform_num AS uniform_num,
p.position AS position,
p.name AS name
FROM players p
RIGHT JOIN goals g
ON p.id = g.player_id;

-- Q25 全ての試合のゴール時間と選手名、国名を表示(オウンゴールも表示）
SELECT 
c.name AS country_name, 
g.goal_time AS goal_time,
p.position AS position,
p.name AS player_name
FROM goals g
LEFT JOIN players p
ON g.player_id = p.id
LEFT JOIN countries c
ON p.country_id = c.id;

-- Q26 全てのゴール時間と得点を上げたプレイヤー名の表示（オウンゴール非表示・サブクエリ）
SELECT 
g.goal_time AS goal_time,
(SELECT p.name 
FROM players p 
WHERE p.id = g.player_id
) AS player_name
FROM goals g
WHERE g.player_id IS NOT NULL;

-- Q27 各ポジション毎の最も身長と、その選手名、所属クラブの表示（FROM句でサブクエリ）
SELECT p.position, p.name, p.height, p.club
FROM players p,
(SELECT position,
MAX(height) AS max_height
FROM players
GROUP BY position
) AS p2
WHERE p.position = p2.position
AND p.height = p2.max_height;

-- Q28 各グループの最上位と最下位を表示し、その差が 50 より大きいグループの抽出
SELECT group_name, MAX(ranking), MIN(ranking)
FROM countries
GROUP BY group_name
HAVING MAX(ranking) - MIN(ranking) > 50
ORDER BY 1;

-- Q29 1980年生まれと、1981年生まれが何人いるか（UNION 句）
SELECT 1980 AS 誕生年, count(id)
FROM players
WHERE birth BETWEEN '1980-01-01' and '1980-12-31'
UNION
SELECT 1981 AS 誕生年, count(id)
FROM players
WHERE birth BETWEEN '1981-01-01' and '1981-12-31’;

-- Q30 身長が 195 ㎝より大きいか、体重が 95kg より大きい選手を抽出(UNION ALL)
SELECT id, position, name, height, weight
FROM players
WHERE height > 195
UNION ALL
SELECT id, position, name, height, weight
FROM players
WHERE weight > 95;

-- Q31 身長の高い順に6位〜20位の選手の抽出
SELECT name, height, weight
FROM players
ORDER BY height DESC, name ASC
OFFSET 5
LIMIT 20;

-- Q32 グループCの各対戦毎のゴール数を表示（ゴール数がゼロも表示・外部結合
-- 模範解答
SELECT 
p1.kickoff, c1.name AS my_country, c2.name AS enemy_country,
c1.ranking AS my_ranking, c2.ranking AS enemy_ranking,
COUNT(g1.id) AS my_goals
FROM pairings p1
LEFT JOIN countries c1 ON c1.id = p1.my_country_id
LEFT JOIN countries c2 ON c2.id = p1.enemy_country_id
LEFT JOIN goals g1 ON p1.id = g1.pairing_id
WHERE c1.group_name = 'C' AND c2.group_name = 'C'
GROUP BY p1.kickoff, c1.name, c2.name, c1.ranking, c2.ranking
ORDER BY p1.kickoff, c1.ranking

-- Q33　グループCの各対戦毎にゴール数の表示（ゴール数がゼロも表示・自国のゴール数はサブクエリ）
-- 模範解答
SELECT 
p1.kickoff, c1.name AS my_country, c2.name AS enemy_country,
c1.ranking AS my_ranking, c2.ranking AS enemy_ranking,
(SELECT COUNT(g1.id) FROM goals g1 WHERE p1.id = g1.pairing_id) AS my_goals
FROM pairings p1
LEFT JOIN countries c1 ON c1.id = p1.my_country_id
LEFT JOIN countries c2 ON c2.id = p1.enemy_country_id
WHERE c1.group_name = 'C' AND c2.group_name = 'C'
ORDER BY p1.kickoff, c1.ranking




