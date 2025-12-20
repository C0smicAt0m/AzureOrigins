execute as @e[tag=sunbeamprimed] at @s run tp @s ^ ^ ^1
execute as @e[tag=sunbeamprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run kill @s
execute as @e[tag=!sunbeamprimed] at @s if entity @e[tag=sunbeamprimed,distance=..1] run damage @s 1 minecraft:on_fire
execute as @e[tag=!sunbeamprimed] at @s if entity @e[tag=sunbeamprimed,distance=..1] run scoreboard players set @s sunburntime 0
execute as @e[tag=!sunbeamprimed] at @s if entity @e[tag=sunbeamprimed,distance=..1] run tag @s add sunfire
execute as @e[tag=sunbeamprimed] at @s if entity @e[tag=!sunbeamprimed,distance=..1] run playsound minecraft:entity.firework_rocket.blast player @a ~ ~ ~ 4.0
execute as @e[tag=sunbeamprimed] at @s if entity @e[tag=!sunbeamprimed,distance=..1] run kill @s
execute as @e[tag=sunbeamprimed] at @s run particle minecraft:flame ~ ~1 ~ .125 .125 .125 0 5