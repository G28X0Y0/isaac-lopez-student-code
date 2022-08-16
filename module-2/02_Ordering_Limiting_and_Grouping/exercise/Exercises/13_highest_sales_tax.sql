-- 13. The state (or territory) name and sales tax for the top five highest sales of tax of all states and territories. 
-- Order the results by sales tax with the highest number first, then by state name alphabetically.
-- (5 rows)
SELECT state_name, sales_tax
FROM state
group by sales_tax, state_name
ORDER BY sales_tax desc, state_name
limit 5;

