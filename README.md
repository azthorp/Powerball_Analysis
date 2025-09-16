# Powerball Analysis in Java

This project analyzes historical **Powerball winning numbers** using Java.  
It demonstrates basic data analysis techniques such as file I/O, string parsing, frequency counting, and ranking.

## Dataset
The dataset comes from [Data.gov: Powerball Winning Numbers (Beginning 2010)](https://catalog.data.gov/dataset/lottery-powerball-winning-numbers-beginning-2010).

The original file contains:
- Draw date
- Winning numbers (5 numbers + Powerball)
- Power Play multiplier

I cleaned the data by:
- Dropping the **final Powerball number** and the **multiplier** (since the focus is only on the 5 main numbers).
- Converting the data to a simplified CSV file:  

- For analysis, only the `"Winning Numbers"` column was used.

## Learning Resources
This project was inspired by [this YouTube tutorial](https://www.youtube.com/watch?v=zKDmzKaAQro&t=193s), which shows how to read CSV files in Java using BufferedReader.

## How It Works
1. Reads the CSV file using BufferedReader.
2. Splits the "Winning Numbers" column into **five separate picks**.
3. Counts how frequently each number appears **by position**:
 - Pick 1
 - Pick 2
 - Pick 3
 - Pick 4
 - Pick 5
4. Ranks the top 3 numbers for each position.
5. Highlights the **most common number** in each position.


## Example Output
Top 3 numbers for Pick 1:  
Number 1 → 139 times  
Number 2 → 124 times  
Number 3 → 120 times  

