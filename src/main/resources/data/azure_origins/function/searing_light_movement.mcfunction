execute as @e[tag=searingprimed] at @s run tp @s ^ ^ ^1
execute as @e[tag=searingprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run kill @s
execute as @e[tag=!searingprimed] at @s if entity @e[tag=searingprimed,distance=..1] run damage @s 1 minecraft:on_fire
execute as @e[tag=!searingprimed] at @s if entity @e[tag=searingprimed,distance=..1] run scoreboard players set @s searburntime 0
execute as @e[tag=!searingprimed] at @s if entity @e[tag=searingprimed,distance=..1] run tag @s add searburn
execute as @e[tag=searingprimed] at @s if entity @e[tag=!searingprimed,distance=..1] run playsound minecraft:entity.firework_rocket.blast player @a ~ ~ ~ 4.0
execute as @e[tag=searingprimed] at @s if entity @e[tag=!searingprimed,distance=..1] run kill @s
execute as @e[tag=searingprimed] at @s run particle minecraft:flame ~ ~1 ~ .125 .125 .125 0 5