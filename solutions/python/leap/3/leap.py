def leap_year(year):
    """
    Evaluates if given year is the Leap year
    """
    return bool((year % 4 == 0 and year % 100 != 0) or year % 400 == 0)
        
