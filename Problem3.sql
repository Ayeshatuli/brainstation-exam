DECLARE @minMark decimal(18, 2)
set @minMark = {customMark};
Select [Name] from STUDENTS where Marks > @minMark order by RIGHT(Name, 3), Id