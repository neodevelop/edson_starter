// https://projecteuler.net/problem=1

accum = 0
for(int i=0; i < 10; i++){
  if(i%3 == 0 || i%5 == 0)
    accum = accum + i
}
println accum
