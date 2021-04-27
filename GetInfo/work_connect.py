import pymysql
import csv

db = pymysql.connect(host='127.0.0.1', port=3306, user='root', passwd='123456', db='book_data', charset='utf8')
cursor = db.cursor()
j = 1
with open('shop result.csv', 'r', encoding='ANSI') as f:
    read = csv.reader(f)
    for each in list(read)[1:]:
        each.insert(0, j)
        j = j + 1
        i = tuple(each)
        sql = "INSERT INTO book_info VALUES" + str(i)
        cursor.execute(sql)
db.commit()
db.close()