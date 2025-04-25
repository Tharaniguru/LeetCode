CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
DETERMINISTIC
BEGIN
    DECLARE ans INT;
    DECLARE offset_val INT;

    SET offset_val = N - 1;

    SELECT DISTINCT salary
    INTO ans
    FROM Employee
    ORDER BY salary DESC
    LIMIT offset_val, 1;

    RETURN ans;
END;
