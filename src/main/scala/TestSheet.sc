(for (i<-1 to 1000) yield print(i)) toStream

val test = (for (i <- 1 to 10000) yield i).toList

for (i <- 1 to 1000) print(i)