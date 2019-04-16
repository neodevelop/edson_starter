// https://projecteuler.net/problem=1

println((1..999).findAll { i -> i%3 == 0 || i%5 == 0 }.sum())
