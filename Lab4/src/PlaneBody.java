package com.company;
import javax.media.j3d.Appearance;
import javax.media.j3d.Material;
import javax.vecmath.Color3f;

import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Primitive;

import java.awt.*;

public class PlaneBody {
    public static Cone getCone(float height, float radius) {
        int primflags = Primitive.GENERATE_NORMALS + Primitive.GENERATE_TEXTURE_COORDS;
        return new Cone(radius, height, primflags, getXMassTreeAppearence());
    }

    private static Appearance getXMassTreeAppearence() {
        Appearance ap = new Appearance();
        Color3f emissive = new Color3f(Color.DARK_GRAY);
        Color3f ambient = new Color3f(Color.DARK_GRAY);
        Color3f diffuse = new Color3f(Color.DARK_GRAY);
        Color3f specular = new Color3f(0.0f, 0.0f, 0.0f);
        ap.setMaterial(new Material(ambient, emissive, diffuse, specular, 1.0f));
        return ap;
    }
}