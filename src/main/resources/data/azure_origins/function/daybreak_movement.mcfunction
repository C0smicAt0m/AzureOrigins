execute as @e[tag=daybreakprimed] at @s run tp @s ^ ^ ^1
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run execute as @e[tag=!daybreakprimed,distance=..5] run damage @s 6 explosion
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run execute as @e[tag=!daybreakprimed,distance=..5] run scoreboard players set @s searburntime 0
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run execute as @e[tag=!daybreakprimed,distance=..5] run tag @s add searburn
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run particle flame ~ ~1 ~ .125 .125 .125 0.5 100
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run playsound entity.generic.explode player @a ~ ~ ~ 4.0
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run execute as @e[tag=!daybreakprimed,distance=..5] run damage @s 6 explosion
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run execute as @e[tag=!daybreakprimed,distance=..5] run scoreboard players set @s searburntime 0
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run execute as @e[tag=!daybreakprimed,distance=..5] run tag @s add searburn
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run particle flame ~ ~1 ~ .125 .125 .125 0.5 100
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run playsound entity.generic.explode player @a ~ ~ ~ 4.0
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run damage @s 4 minecraft:on_fire
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run scoreboard players set @s searburntime 0
execute as @e[tag=!daybreakprimed] at @s if entity @e[tag=daybreakprimed,distance=..1] run tag @s add searburn
execute as @e[tag=daybreakprimed] at @s if entity @e[tag=!daybreakprimed,distance=..1] run kill @s
execute as @e[tag=daybreakprimed] at @s unless block ~ ~1 ~ #azure_origins:non_solid run kill @s
execute as @e[tag=daybreakprimed] at @s run particle minecraft:flame ~ ~1 ~ .125 .125 .125 0 5