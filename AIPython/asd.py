# Nojus Lankelis
# 27/02/2024
# V1.0

def welcome_to_college():
    print('Welcome to North East Scotland College')


def display_name_with_border():
    name = 'Nojus Lankelis'
    print('*' * (len(name) + 4))
    print(f'* {name} *')
    print('*' * (len(name) + 4))


def add_10_to_number():
    number = int(input('Enter a number: '))
    result = number + 10
    print(f'The result is: {result}')


def display_given_text():
    print('Watch your step or you will')
    print('                           fall')
    print('                               into')
    print('                                   the')
    print('                                      hole.')
    print('                                     THUMP!')


def friendly_welcome_to_college():
    name = input('Enter your name: ')
    print(f'Hello {name}, Welcome to North East Scotland College')


def add_two_numbers():
    num1 = float(input('Enter the first number: '))
    num2 = float(input('Enter the second number: '))
    total = num1 + num2
    print(f'The total is: {total}')


def display_given_text_airplane():
    print('                                                     the air')
    print('								                    into')
    print('                                             off')
    print('                                         takes')
    print('                                     and')
    print('The aeroplane moves along the runway')


def print_powers_of_number():
    number = float(input('Enter a number: '))
    square = number ** 2
    cube = number ** 3
    fourth_power = number ** 4
    print(f'Square: {square}, Cube: {cube}, Fourth Power: {fourth_power}')


def display_name_and_address():
    name = 'Nojus Lankelis'
    address = """123 Kirkburn drive\nPeterhead"""
    print(name)
    print(address)


def inform_student_average_mark():
    exam1 = float(input('Enter mark for Exam 1: '))
    exam2 = float(input('Enter mark for Exam 2: '))
    exam3 = float(input('Enter mark for Exam 3: '))
    exam4 = float(input('Enter mark for Exam 4: '))

    average_mark = (exam1 + exam2 + exam3 + exam4) / 4
    print(f'Your average mark is: {average_mark}')


welcome_to_college()
display_name_with_border()
add_10_to_number()
display_given_text()
friendly_welcome_to_college()
add_two_numbers()
display_given_text_airplane()
print_powers_of_number()
display_name_and_address()
inform_student_average_mark()
