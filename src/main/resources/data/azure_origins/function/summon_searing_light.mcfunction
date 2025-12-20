execute as @s at @s run summon minecraft:armor_stand ^ ^0.5 ^1 {Tags:[searing],NoGravity:1b,Small:1b,Invisible:1b,Invulnerable:1b}
execute as @e[tag=searing] run data modify entity @s Rotation set from entity @p Rotation
tag @e[tag=searing] add searingprimed
tag @e[tag=searingprimed] remove searing
playsound minecraft:item.firecharge.use