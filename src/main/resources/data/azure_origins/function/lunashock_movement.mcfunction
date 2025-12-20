execute as @e[tag=lunashockprimed] at @s run tp @s ^ ^ ^1
execute as @e[tag=lunashockprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run kill @s
execute as @e[tag=!lunashockprimed] at @s if entity @e[tag=lunashockprimed,distance=..1] run damage @s 8 minecraft:sonic_boom
execute as @e[tag=!lunashockprimed] at @s if entity @e[tag=lunashockprimed,distance=..1] run playsound item.mace.smash_air player @a ~ ~ ~ 4.0
execute as @e[tag=lunashockprimed] at @s if entity @e[tag=!lunashockprimed,distance=..1] run kill @s
execute as @e[tag=lunashockprimed] at @s run particle minecraft:glow ~ ~1 ~ .125 .125 .125 0 5