/*
Example of high order function and function literal

1)

def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
}
safeStringOp("Crap", (s: String) => {s.reverse})
safeStringOp(null, (s: String) => {s.reverse})

2)

def safeStringOp(s: String, f: String => String) = {
    if (s != null) f(s) else s
}
safeStringOp("Crap", _.reverse)
safeStringOp(null, _.reverse)


For the code above, the second argument of the function is an another function.
*/

