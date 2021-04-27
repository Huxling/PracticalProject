import pymysql
import csv

db = pymysql.connect(host='127.0.0.1', port=3306, user='root', passwd='123456', db='book_data', charset='utf8')
cursor = db.cursor()
j = 1
with open('shop result.csv', 'r', encoding='ANSI') as f:
db.commit()
db.close()