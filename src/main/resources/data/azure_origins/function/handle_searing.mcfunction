execute at @e[tag=searburn] run particle flame ~ ~1 ~ .1 .1 .1 0.05 2
execute as @e[tag=searburn] at @s run damage @s 1 on_fire
execute as @e[tag=searburn] run scoreboard players add @s searburntime 1
execute as @e[tag=searburn] if score @s searburntime matches 100 run tag @s remove searburn