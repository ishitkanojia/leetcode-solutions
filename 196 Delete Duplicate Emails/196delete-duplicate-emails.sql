DELETE FROM Person
WHERE Id NOT IN (
    SELECT min(id)
    FROM Person
    GROUP BY email);