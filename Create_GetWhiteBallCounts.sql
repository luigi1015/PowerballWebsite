DROP PROCEDURE IF EXISTS GetWhiteBallCounts;

DELIMITER $$
CREATE PROCEDURE GetWhiteBallCounts()
BEGIN
	SELECT Number, COUNT(Number) as Count
	FROM PowerballDrawingInfo
	WHERE NumberType = 1
	GROUP BY Number
	ORDER BY Count DESC;
END$$
DELIMITER ;
