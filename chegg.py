def load_data(filename):
    with open(filename, 'r') as file:
        lines = file.readlines()
    return lines[1:]  # Exclude the header line

def parse_record(record):
    record = record.strip().split(',')
    record[0] = int(record[0])
    record[-1] = int(record[-1])
    return record

def print_records(records):
    print("ID   Make           Model         Year   Price")
    for record in records:
        print("[{:<3}] {:<12} {:<12} {:<6} R{:>8}".format(*record))

def compute_summary(records):
    num_cars = len(records)
    total_price = sum(record[-1] for record in records)
    avg_price = total_price / num_cars
    cheapest_car = min(records, key=lambda x: x[-1])
    most_expensive_car = max(records, key=lambda x: x[-1])
    return num_cars, avg_price, cheapest_car, most_expensive_car

def bubble_sort(records):
    n = len(records)
    for i in range(n - 1):
        for j in range(n - 1 - i):
            if records[j][-1] > records[j + 1][-1]:
                records[j], records[j + 1] = records[j + 1], records[j]

# Load the data
filename = "smith_singh_car_dealership.txt"
lines = load_data(filename)

# Parse and print the records
records = [parse_record(line) for line in lines]
print_records(records)

# Compute the data summary
num_cars, avg_price, cheapest_car, most_expensive_car = compute_summary(records)
print("\nData Summary:")
print("Number of cars:", num_cars)
print("Average price: R{:.2f}".format(avg_price))
print("Cheapest car: ID {}, Make: {}, Model: {}, Year: {}, Price: R{}".format(*cheapest_car))
print("Most expensive car: ID {}, Make: {}, Model: {}, Year: {}, Price: R{}".format(*most_expensive_car))

# Sort the records using bubble sort
bubble_sort(records)

# Print the sorted records
print("\nSorted Records (Descending Order of Price):")
print_records(records)
