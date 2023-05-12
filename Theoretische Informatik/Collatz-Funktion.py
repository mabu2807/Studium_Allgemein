def main():
    alpha=3
    beta=7
    n=14
    counter = 0

    while True:
        if n%2 == 0:
            n = n/2
        else: 
            n = alpha * n + beta
        counter += 1
        print(n, counter)
        if n == 1:
            break

if __name__ == '__main__':
    main()