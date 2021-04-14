package com.company;

import java.awt.*;
import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.vecmath.Color3f;
import javax.vecmath.Color4f;

import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.geometry.Primitive;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.image.TextureLoader;

public class PlaneDetails {

    public static Sphere getSphere(float radius, String picture, Color3f emissiveColor) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Sphere(radius, primflags, getXMassBallsAppearence(picture, emissiveColor));
    }

    public static Box getBox(float x, float y, float z,String picture, Color3f emissiveColor) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Box (x, y, z, primflags, getXMassBallsAppearence(picture, emissiveColor));
    }

    private static Appearance getXMassBallsAppearence(String picture, Color3f emissive) {
        Appearance ap = new Appearance();
        Color3f ambient = new Color3f(Color.DARK_GRAY);
        Color3f diffuse = new Color3f(Color.DARK_GRAY);
        Color3f specular = new Color3f(0.0f, 0.0f, 0.0f);
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));

        if (picture != "") {    // завантажуємо текстуру
            TextureLoader loader = new TextureLoader(picture, "LUMINANCE", new Container());
            Texture texture = loader.getTexture();    // задаємо властивості границі
            texture.setBoundaryModeS(Texture.WRAP);
            texture.setBoundaryModeT(Texture.WRAP);
            texture.setBoundaryColor(new Color4f(0.0f, 1.0f, 1.0f, 0.0f));
            TextureAttributes texAttr = new TextureAttributes();
            texAttr.setTextureMode(TextureAttributes.MODULATE);
            ap.setTexture(texture);
            ap.setTextureAttributes(texAttr);
        }   return ap;
    }
}