SELECT COUNT(*) AS FISH_COUNT, FNI.FISH_NAME AS FISH_NAME
FROM FISH_INFO FI, FISH_NAME_INFO FNI
WHERE FI.FISH_TYPE = FNI.FISH_TYPE
GROUP BY FISH_NAME
ORDER BY FISH_COUNT DESC