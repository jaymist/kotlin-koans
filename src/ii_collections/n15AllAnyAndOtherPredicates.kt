package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    return this.city == city
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    return customers.all { customer -> customer.city == city }
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    return customers.any { customer -> customer.city == city }
}

fun Shop.countCustomersFrom(city: City): Int {
    return customers.count { customer -> customer.city == city }
}

fun Shop.findFirstCustomerFrom(city: City): Customer? {
    return customers.firstOrNull { customer -> customer.city == city }
}
