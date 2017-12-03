DROP PROCEDURE IF EXISTS GetPowerballCounts;

DELIMITER $$
CREATE PROCEDURE GetPowerballCounts()
BEGIN
	SELECT Number, COUNT(Number) as Count
	FROM PowerballDrawingInfo
	WHERE NumberType = 2
	GROUP BY Number
	ORDER BY Count DESC;
END$$
DELIMITER ;
