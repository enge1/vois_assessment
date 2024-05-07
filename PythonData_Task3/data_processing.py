import pandas as pd

df = pd.read_csv('Employees.csv')

df = df.drop_duplicates()

df['Age'] = df['Age'].astype(int)


df['Salary(EGP)'] = df['Salary(USD)'] * 48

print("Average age:", df['Age'].mean())
print("Median salary:", df['Salary(USD)'].median())

gender_counts = df['Gender'].value_counts()
if 'M' in gender_counts.index and 'F' in gender_counts.index:
    male_count = gender_counts['M']
    female_count = gender_counts['F']
    print("Ratio between males and female employees:", male_count / female_count)
else:
    print("Gender information is missing or not labeled correctly.")

df.to_csv('output_file.csv', index=False)
