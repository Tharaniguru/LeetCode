# Write your MySQL query statement below
select firstName,lastName,city,state from 
person t1 left join address t2 on t1.personid=t2.personid;