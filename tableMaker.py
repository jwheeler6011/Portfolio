import csv
import sqlite

df = pd.read_excel("C:\\Users\\16312\\Documents\\TestSheet.xlsx")

theNum = len(df)

col1 = df.at[0,"id"]
col2 = df.at[0,"name"]
col3 = df.at[0,"age"]

conn = sqlite3.connect('example.db')

cursor.execute('''
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY,
        name TEXT,
        age INTEGER
    )
''')

for i in theNum:
    cursor.execute('insert into users(id,name,age) VALUES('+col1+','+col2+','+col3')')



conn.commit()
conn.close()





