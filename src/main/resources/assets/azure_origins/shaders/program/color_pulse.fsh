#version 150

uniform sampler2D DiffuseSampler;
uniform float LongTime;
uniform vec4 Color;
uniform float Strength;
uniform float PulseOffset;
uniform float Interval;

in vec2 texCoord;

out vec4 fragColor;

void main(){
    vec4 original = texture(DiffuseSampler, texCoord);

    float timeSec = LongTime / 20.0;

    float angle = (timeSec - PulseOffset) * (1.0 / Interval) * (2.0 * 3.1415926535);
    float pulse = 0.0;

    if (sin(angle) > 0) {
        pulse = 0.5 * cos(angle) + 0.5;
    }
    else {
        pulse = 0.0;
    }

    vec3 pulsedColor = mix(original.rgb, original.rgb * Color.rgb, pulse);

    vec3 finalColor = mix(original.rgb, pulsedColor, Strength);

    fragColor = vec4(clamp(finalColor, 0.0, 1.0), 1.0);
}