@file:Suppress("unused")

package com.theendercore


// Maps
val THE_ONE_TYPES = listOf(
    "_zero",
    "_one",
    "_two",
    "_three",
    "_four",
    "_five",
    "_six",
    "_seven",
    "_eight",
    "_nine",
    "_skip",
    "_draw_two",
    "_reverse",
    "-",
)
val THE_ONE_COLORS = listOf(
    "cards/the_one/red%s",
    "cards/the_one/yellow%s",
    "cards/the_one/green%s",
    "cards/the_one/blue%s",
    "-", //wild
    "-"  //blank
)

val COLORS = listOf(
    "",
    "black_",
    "blue_",
    "brown_",
    "cyan_",
    "gray_",
    "green_",
    "light_blue_",
    "light_gray_",
    "lime_",
    "magenta_",
    "orange_",
    "pink_",
    "purple_",
    "red_",
    "white_",
    "yellow_"
)
val CANDLES = listOf(
    "_",
    "_",
    "_",
    "item/big_%scandle",
    "block/big_%scandle",
    "block/big_%scandle_lit",
    "item/%ssoul_candle",
    "block/%ssoul_candle",
    "block/%ssoul_candle_lit",
    "item/big_%ssoul_candle",
    "block/big_%ssoul_candle",
    "block/big_%ssoul_candle_lit",
)

val MOSS_COLORS = listOf(
    "", // No Color
    "pale_", //Pale
    "crimson_", // Red
    "magmatic_", // Orange
    "royal_", // Yellow
    "glowing_", // Lime
    "dark_", // Green
    "maritime_", // Cyan
    "warped_", // Light Blue
    "azure_", // Blue
    "arcane_", // Purple
    "twisted_", // Magenta
    "rosy_", // Pink
    "ancient_", // Brown
    "ashen_", // Black
    "chrome_", // Gray
    "dusky_", // Light Gray
    "bone_", // White
)
val MOSS_TEXTURES = listOf(
    "%smoss",
    "%sbush_top",
    "%sbush_plant",
    "%sbush_side",
    "%sleaves",
    "potted_%sbush_plant",
    "potted_%sbush_side",
    "potted_%sbush_top",
    "%shanging_moss",
    "%shanging_moss_tip",
    "flowering_%smoss",
    "flowering_%sbush_top",
    "flowering_%sbush_plant",
    "flowering_%sbush_side",
    "flowering_%sleaves",
    "potted_flowering_%sbush_plant",
    "potted_flowering_%sbush_side",
    "potted_flowering_%sbush_top",
    "flowering_%shanging_moss",
    "flowering_%shanging_moss_tip",
    "-",
)

val PUMPKINS = listOf(
    "-",
    "lantern",
    "mosskin",
    "gloom",
    "pale",
    "-",
    "-",
    "-"
)
val PUMPKIN_ITEMS = listOf(
    "-",
    "-",
    "block/stuffed_%s_pumpkin_block_side",
    "block/stuffed_%s_pumpkin_block_top",
    "block/stuffed_%s_pumpkin_block_bottom",
    "item/%s_pumpkin_slice",
    "item/stuffed_%s_pumpkin",
    "item/stuffed_%s_pumpkin_block",
    "item/%s_pumpkin_soup",
    "item/%s_pumpkin_pie",
    "item/%s_pumpkin_pie_slice",
    "block/%s_pumpkin_pie_top",
    "block/%s_pumpkin_pie_inner",
    "-",
)

val AC_WOODS = listOf(
    "-",
    "-",
    "cascade",
    "twisted",
    "rotwood",
    "-"
)
val AC_WOOD_VARIANTS = listOf(
    "-",
    "-",
    "%s_boards",
    "%s_boards_odd",
    "%s_table_top",
    "%s_table_bottom",
    "%s_table",
    "-",
    "%s_cabinet_top",
    "%s_cabinet_front",
    "%s_cabinet_front_open",
    "%s_cabinet_side"
)

val VV_WOODS = listOf(
    "-",
    "spruce",
    "birch",
    "jungle",
    "acacia",
    "dark_oak",
    "mangrove",
    "cherry",
    "bamboo",
    "crimson",
    "warped",
    "-",
    "-"
)
val VV_WOOD_VARIANTS = listOf(
    "-",
    "%s_bookshelf",
    "-",
    "-",
    "-",
    "-",
    "-"
)
val AC_NUB_MATERIALS = listOf(
    "-",
    "-",
    "polished_nether_brick",
    "polished_red_nether_brick",
    "polished_blue_nether_brick",
    "polished_gray_nether_brick",
    "gothstone",
    "schist",
    "rhyolite",
)
val AC_NUB_VARIANTS = listOf(
    "-",
    "%s_nub_side",
    "%s_nub_top",
)
val TERA_GEMS = listOf(
    "",
    "normal_",
    "fire_",
    "water_",
    "electric_",
    "grass_",
    "ice_",
    "fighting_",
    "poison_",
    "ground_",
    "flying_",
    "psychic_",
    "bug_",
    "rock_",
    "ghost_",
    "dragon_",
    "dark_",
    "steel_",
    "fairy_",
    "stellar_",
)
val TERA_GEM_CUTS = listOf(
    "%stera_shard",
    "%stera_gem",
)


val COPPER_FAN = listOf(
    "copper_fan",
    "copper_fan_powered",
    "exposed_copper_fan",
    "exposed_copper_fan_powered",
    "weathered_copper_fan",
    "weathered_copper_fan_powered",
    "oxidized_copper_fan",
    "oxidized_copper_fan_powered"
)
val TOP_SIDE_BOTTOM = listOf(
    "block/%s_top",
    "block/%s_side",
    "block/%s_bottom",
)
val GODHOME_SHIFT = listOf(
    "shift_block_radiant",
    "shift_block_shining",
    "shift_block_somber"
)
val FRONT_TOP_SIDE_BACK = listOf(
    "block/%s_front",
    "block/%s_top",
    "block/%s_side",
    "block/%s_back",
)

// Single Lists
val WOOD_SET = listOf(
    "block/%s_log_top",
    "block/stripped_%s_log_top",
    "block/%s_planks",
    "block/%s_door_top",
    "block/%s_leaves",

    "block/%s_log",
    "block/stripped_%s_log",
    "block/%s_trapdoor",
    "block/%s_door_bottom",
    "block/%s_sapling",

    "-",
    "-",
    "-",
    "-",
    "item/%s_door",

    "-",
    "-",
    "-",
    "-",
    "item/%s_sign",

    "-",
    "-",
    "-",
    "-",
    "item/%s_hanging_sign",

    "-",
    "-",
    "-",
    "-",
    "gui/hanging_signs/%s"
)
val CROSSHAIR_ICONS = listOf(
    "sprint",
    "sneak",
    "sprint_alt",
    "sneak_alt",
    "c",
    "corner",
    "3",
    "symbol",
    "star",
    "cut_stair",
    "thin_stair",
    "small_stair",
    "bone",
    "wand",
    "hunger",
    "feather",
    "big_circle",
    "block_sign",
    "big_hollow_circle",
    "oval",
    "circle",
    "plus",
    "brick",
    "hollow_brick",
    "big_square",
    "big_hollow_square",
    "rectangle",
    "hollow_rectangle",
    "square",
    "hollow_square",
    "small_square",
    "small_rectangle",
    "line",
    "think_line",
    "handle",
    "round_handle",
    "nub",
    "saw_blade",
    "zig_zag",
    "dot",
    "t_tetromino",
    "c_tetromino",
    "j_tetromino",
    "z_tetromino",
    "notch",
    "zig",
    "checkerboard",
    "checkerboard_alt",
    "big_diagonal",
    "diagonal",
    "small_diagonal",
    "big_gem",
    "gem",
    "small_gem",
    "x",
    "big_x",
    "cross",
    "stick",
    "t",
    "small_t",
    "hoe",
    "pickaxe",
    "axe",
    "diagonal_handle",
)


private const val chestName = "stone_chest"
val STONE_CHEST_SIDE = listOf(
    "%s",
    "%s_left",
    "%s_right",
)
val STONE_CHEST_TYPE = listOf(
    chestName + "_front",
    chestName + "_back",
    chestName + "_side",
    chestName + "_top",
    chestName + "_bottom",
    chestName + "_top_open",
    chestName + "_bottom_open",
)
val STONE_CHEST_ALT = listOf(
    "block/%s_front",
    "block/%s_side",
    "block/%s_top",
    "block/%s_bottom",

    "block/%s_front_left",
    "block/%s_front_right",
    "block/%s_back_right",
    "block/%s_back_left",

    "block/%s_top_left",
    "block/%s_top_right",
    "block/%s_bottom_right",
    "block/%s_bottom_left",
)