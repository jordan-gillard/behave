if (Directory.equals("orders")) {
    return ["create_order.feature", "delete_order.feature", "modify_order.feature"]
} else if (Directory.equals("routes")) {
    return ["create_route.feature", "delete_route.feature"]
} else if (Directory.equals("baskets")) {
    return ["create_basket.feature", "delete_basket.feature", "aggregate_basket.feature", "rename_basket.feature"]
} else {
    return ["Unknown Feature"]
}