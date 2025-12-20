execute at @e[tag=sunfire] run particle flame ~ ~1 ~ .1 .1 .1 0.05 2
execute as @e[tag=sunfire] at @s run damage @s 1 on_fire
execute as @e[tag=sunfire] run scoreboard players add @s sunburntime 1
execute as @e[tag=sunfire] if score @s sunburntime matches 80 run tag @s remove sunfire