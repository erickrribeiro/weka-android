package com.erick.wekaandroid;
import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;

/**
 * Created by Erick on 12/11/2015.
 */
// Generated with Weka 3.6.13
//
// This code is public domain and comes with no warranty.
//
// Timestamp: Thu Nov 12 18:46:51 BRST 2015



class WekaWrapper extends Classifier {

    /**
     * Returns only the toString() method.
     *
     * @return a string describing the classifier
     */
    public String globalInfo() {
        return toString();
    }

    /**
     * Returns the capabilities of this classifier.
     *
     * @return the capabilities
     */
    public Capabilities getCapabilities() {
        weka.core.Capabilities result = new weka.core.Capabilities(this);

        result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
        result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
        result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
        result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);

        result.setMinimumNumberInstances(0);

        return result;
    }

    /**
     * only checks the data against its capabilities.
     *
     * @param i the training data
     */
    public void buildClassifier(Instances i) throws Exception {
        // can classifier handle the data?
        getCapabilities().testWithFail(i);
    }

    /**
     * Classifies the given instance.
     *
     * @param i the instance to classify
     * @return the classification result
     */
    public double classifyInstance(Instance i) throws Exception {
        Object[] s = new Object[i.numAttributes()];

        for (int j = 0; j < s.length; j++) {
            if (!i.isMissing(j)) {
                if (i.attribute(j).isNominal())
                    s[j] = new String(i.stringValue(j));
                else if (i.attribute(j).isNumeric())
                    s[j] = new Double(i.value(j));
            }
        }

        // set class value to missing
        s[i.classIndex()] = null;

        return WekaClassifierJ48.classify(s);
    }

    /**
     * Returns the revision string.
     *
     * @return        the revision
     */
    public String getRevision() {
        return RevisionUtils.extract("1.0");
    }

    /**
     * Returns only the classnames and what classifier it is based on.
     *
     * @return a short description
     */
    public String toString() {
        return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.6.13).\n" + this.getClass().getName() + "/WekaClassifierJ48";
    }

    /**
     * Runs the classfier from commandline.
     *
     * @param args the commandline arguments
     */
    public static void main(String args[]) {
        runClassifier(new WekaWrapper(), args);
    }
}

public class WekaClassifierJ48 {

    public static double classify(Object[] i)
            throws Exception {

        double p = Double.NaN;
        p = WekaClassifierJ48.N1f5596a0(i);
        return p;
    }
    static double N1f5596a0(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 2;
        } else if (((Double) i[10]).doubleValue() <= 114.79146575927734) {
            p = WekaClassifierJ48.N1fcff81(i);
        } else if (((Double) i[10]).doubleValue() > 114.79146575927734) {
            p = WekaClassifierJ48.N14db86d423(i);
        }
        return p;
    }
    static double N1fcff81(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 3;
        } else if (((Double) i[11]).doubleValue() <= -34.11011505126953) {
            p = WekaClassifierJ48.Nce0d42(i);
        } else if (((Double) i[11]).doubleValue() > -34.11011505126953) {
            p = WekaClassifierJ48.Ncd63a843(i);
        }
        return p;
    }
    static double Nce0d42(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= -0.24059584736824036) {
            p = WekaClassifierJ48.N1adcdab3(i);
        } else if (((Double) i[14]).doubleValue() > -0.24059584736824036) {
            p = WekaClassifierJ48.N118078f25(i);
        }
        return p;
    }
    static double N1adcdab3(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.683901309967041) {
            p = WekaClassifierJ48.Nb8fc3d4(i);
        } else if (((Double) i[12]).doubleValue() > 0.683901309967041) {
            p = WekaClassifierJ48.Nc0905d5(i);
        }
        return p;
    }
    static double Nb8fc3d4(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 2;
        } else if (((Double) i[11]).doubleValue() <= -85.08071899414062) {
            p = 2;
        } else if (((Double) i[11]).doubleValue() > -85.08071899414062) {
            p = 0;
        }
        return p;
    }
    static double Nc0905d5(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= -0.30169937014579773) {
            p = WekaClassifierJ48.N1bfda516(i);
        } else if (((Double) i[14]).doubleValue() > -0.30169937014579773) {
            p = WekaClassifierJ48.N22b1ba23(i);
        }
        return p;
    }
    static double N1bfda516(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -71.27794647216797) {
            p = WekaClassifierJ48.N2681587(i);
        } else if (((Double) i[11]).doubleValue() > -71.27794647216797) {
            p = WekaClassifierJ48.N1e6ed249(i);
        }
        return p;
    }
    static double N2681587(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= 0.29584434628486633) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() > 0.29584434628486633) {
            p = WekaClassifierJ48.N1a4c9758(i);
        }
        return p;
    }
    static double N1a4c9758(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.4111920893192291) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.4111920893192291) {
            p = 4;
        }
        return p;
    }
    static double N1e6ed249(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() <= 327.70635986328125) {
            p = WekaClassifierJ48.N4cc5b10(i);
        } else if (((Double) i[9]).doubleValue() > 327.70635986328125) {
            p = WekaClassifierJ48.N3c2a2019(i);
        }
        return p;
    }
    static double N4cc5b10(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= -0.4769487977027893) {
            p = WekaClassifierJ48.N34aec211(i);
        } else if (((Double) i[14]).doubleValue() > -0.4769487977027893) {
            p = WekaClassifierJ48.N17904ff14(i);
        }
        return p;
    }
    static double N34aec211(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 4;
        } else if (((Double) i[11]).doubleValue() <= -64.73454284667969) {
            p = 4;
        } else if (((Double) i[11]).doubleValue() > -64.73454284667969) {
            p = WekaClassifierJ48.N10e2cd012(i);
        }
        return p;
    }
    static double N10e2cd012(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 0.25760340690612793) {
            p = WekaClassifierJ48.N145789813(i);
        } else if (((Double) i[4]).doubleValue() > 0.25760340690612793) {
            p = 4;
        }
        return p;
    }
    static double N145789813(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() <= -10.975020408630371) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() > -10.975020408630371) {
            p = 0;
        }
        return p;
    }
    static double N17904ff14(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 4;
        } else if (((Double) i[10]).doubleValue() <= -177.90780639648438) {
            p = WekaClassifierJ48.Nfefdec15(i);
        } else if (((Double) i[10]).doubleValue() > -177.90780639648438) {
            p = 4;
        }
        return p;
    }
    static double Nfefdec15(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() <= 0.09576806426048279) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() > 0.09576806426048279) {
            p = WekaClassifierJ48.N52244f16(i);
        }
        return p;
    }
    static double N52244f16(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= -0.1621302366256714) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() > -0.1621302366256714) {
            p = WekaClassifierJ48.N89182517(i);
        }
        return p;
    }
    static double N89182517(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= -0.21092236042022705) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() > -0.21092236042022705) {
            p = WekaClassifierJ48.N134b43718(i);
        }
        return p;
    }
    static double N134b43718(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.2087918370962143) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.2087918370962143) {
            p = 4;
        }
        return p;
    }
    static double N3c2a2019(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= -0.4737226366996765) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() > -0.4737226366996765) {
            p = WekaClassifierJ48.N1f7177420(i);
        }
        return p;
    }
    static double N1f7177420(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.8116594552993774) {
            p = WekaClassifierJ48.N187695f21(i);
        } else if (((Double) i[12]).doubleValue() > 0.8116594552993774) {
            p = 4;
        }
        return p;
    }
    static double N187695f21(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() <= -0.7265103459358215) {
            p = WekaClassifierJ48.N124f15422(i);
        } else if (((Double) i[6]).doubleValue() > -0.7265103459358215) {
            p = 0;
        }
        return p;
    }
    static double N124f15422(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 2.011129379272461) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 2.011129379272461) {
            p = 4;
        }
        return p;
    }
    static double N22b1ba23(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -0.3664509654045105) {
            p = WekaClassifierJ48.N1e740fd24(i);
        } else if (((Double) i[8]).doubleValue() > -0.3664509654045105) {
            p = 4;
        }
        return p;
    }
    static double N1e740fd24(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= -0.5326322317123413) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() > -0.5326322317123413) {
            p = 0;
        }
        return p;
    }
    static double N118078f25(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() <= 2.164358377456665) {
            p = WekaClassifierJ48.N1aee56926(i);
        } else if (((Double) i[1]).doubleValue() > 2.164358377456665) {
            p = WekaClassifierJ48.Nf33f7d34(i);
        }
        return p;
    }
    static double N1aee56926(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 3;
        } else if (((Double) i[2]).doubleValue() <= -0.4213795065879822) {
            p = WekaClassifierJ48.N40354727(i);
        } else if (((Double) i[2]).doubleValue() > -0.4213795065879822) {
            p = WekaClassifierJ48.N491d0f30(i);
        }
        return p;
    }
    static double N40354727(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 3;
        } else if (((Double) i[7]).doubleValue() <= 0.17044231295585632) {
            p = 3;
        } else if (((Double) i[7]).doubleValue() > 0.17044231295585632) {
            p = WekaClassifierJ48.N1476bda28(i);
        }
        return p;
    }
    static double N1476bda28(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 3;
        } else if (((Double) i[5]).doubleValue() <= 0.13611459732055664) {
            p = WekaClassifierJ48.N4c3a0229(i);
        } else if (((Double) i[5]).doubleValue() > 0.13611459732055664) {
            p = 0;
        }
        return p;
    }
    static double N4c3a0229(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 3;
        } else if (((Double) i[6]).doubleValue() <= 2.614158868789673) {
            p = 3;
        } else if (((Double) i[6]).doubleValue() > 2.614158868789673) {
            p = 1;
        }
        return p;
    }
    static double N491d0f30(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= -0.002976103685796261) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() > -0.002976103685796261) {
            p = WekaClassifierJ48.N114e58c31(i);
        }
        return p;
    }
    static double N114e58c31(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 1.1875240802764893) {
            p = WekaClassifierJ48.N1674ecf32(i);
        } else if (((Double) i[1]).doubleValue() > 1.1875240802764893) {
            p = 0;
        }
        return p;
    }
    static double N1674ecf32(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 0.14691051840782166) {
            p = WekaClassifierJ48.Ne4fc8b33(i);
        } else if (((Double) i[3]).doubleValue() > 0.14691051840782166) {
            p = 1;
        }
        return p;
    }
    static double Ne4fc8b33(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 2;
        } else if (((Double) i[5]).doubleValue() <= 1.0981097221374512) {
            p = 2;
        } else if (((Double) i[5]).doubleValue() > 1.0981097221374512) {
            p = 1;
        }
        return p;
    }
    static double Nf33f7d34(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= 0.8225235342979431) {
            p = WekaClassifierJ48.N25932a35(i);
        } else if (((Double) i[13]).doubleValue() > 0.8225235342979431) {
            p = WekaClassifierJ48.N6b700142(i);
        }
        return p;
    }
    static double N25932a35(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.4678015410900116) {
            p = WekaClassifierJ48.N12db85736(i);
        } else if (((Double) i[12]).doubleValue() > 0.4678015410900116) {
            p = WekaClassifierJ48.N1d9b1fd39(i);
        }
        return p;
    }
    static double N12db85736(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -37.5806770324707) {
            p = WekaClassifierJ48.N3613dd37(i);
        } else if (((Double) i[11]).doubleValue() > -37.5806770324707) {
            p = 0;
        }
        return p;
    }
    static double N3613dd37(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.0238906629383564) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -0.0238906629383564) {
            p = WekaClassifierJ48.N12dc0b138(i);
        }
        return p;
    }
    static double N12dc0b138(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.2723110020160675) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > 0.2723110020160675) {
            p = 0;
        }
        return p;
    }
    static double N1d9b1fd39(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= 0.45455625653266907) {
            p = WekaClassifierJ48.N126591140(i);
        } else if (((Double) i[13]).doubleValue() > 0.45455625653266907) {
            p = WekaClassifierJ48.N1580f9341(i);
        }
        return p;
    }
    static double N126591140(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.5868354439735413) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 0.5868354439735413) {
            p = 4;
        }
        return p;
    }
    static double N1580f9341(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.5049353241920471) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.5049353241920471) {
            p = 3;
        }
        return p;
    }
    static double N6b700142(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 0.08080431073904037) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 0.08080431073904037) {
            p = 0;
        }
        return p;
    }
    static double Ncd63a843(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.274360656738281) {
            p = WekaClassifierJ48.N13c5e7144(i);
        } else if (((Double) i[1]).doubleValue() > 8.274360656738281) {
            p = WekaClassifierJ48.N1a33424230(i);
        }
        return p;
    }
    static double N13c5e7144(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 29.461894989013672) {
            p = WekaClassifierJ48.N23ec9245(i);
        } else if (((Double) i[11]).doubleValue() > 29.461894989013672) {
            p = WekaClassifierJ48.N1961cb8215(i);
        }
        return p;
    }
    static double N23ec9245(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 7.163451671600342) {
            p = WekaClassifierJ48.N173796f46(i);
        } else if (((Double) i[2]).doubleValue() > 7.163451671600342) {
            p = WekaClassifierJ48.N1e39bfb121(i);
        }
        return p;
    }
    static double N173796f46(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -147.325927734375) {
            p = WekaClassifierJ48.Nd89b0a47(i);
        } else if (((Double) i[10]).doubleValue() > -147.325927734375) {
            p = WekaClassifierJ48.Nad4dd51(i);
        }
        return p;
    }
    static double Nd89b0a47(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -1.4034550189971924) {
            p = WekaClassifierJ48.N1fa9c3648(i);
        } else if (((Double) i[3]).doubleValue() > -1.4034550189971924) {
            p = WekaClassifierJ48.N96a4e749(i);
        }
        return p;
    }
    static double N1fa9c3648(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 289.33551025390625) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 289.33551025390625) {
            p = 4;
        }
        return p;
    }
    static double N96a4e749(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 3.413771629333496) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 3.413771629333496) {
            p = WekaClassifierJ48.N3a1bdb50(i);
        }
        return p;
    }
    static double N3a1bdb50(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= 0.08522115647792816) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() > 0.08522115647792816) {
            p = 0;
        }
        return p;
    }
    static double Nad4dd51(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 3;
        } else if (((Double) i[9]).doubleValue() <= 0.01919032447040081) {
            p = WekaClassifierJ48.N1dce10652(i);
        } else if (((Double) i[9]).doubleValue() > 0.01919032447040081) {
            p = WekaClassifierJ48.N1af082a61(i);
        }
        return p;
    }
    static double N1dce10652(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 3;
        } else if (((Double) i[2]).doubleValue() <= -2.7772738933563232) {
            p = WekaClassifierJ48.Nead70653(i);
        } else if (((Double) i[2]).doubleValue() > -2.7772738933563232) {
            p = WekaClassifierJ48.Na4c99657(i);
        }
        return p;
    }
    static double Nead70653(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() <= -0.019153613597154617) {
            p = WekaClassifierJ48.Nf8fb8354(i);
        } else if (((Double) i[1]).doubleValue() > -0.019153613597154617) {
            p = WekaClassifierJ48.N147e3d55(i);
        }
        return p;
    }
    static double Nf8fb8354(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -6.378153324127197) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -6.378153324127197) {
            p = 3;
        }
        return p;
    }
    static double N147e3d55(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() <= 1.37906014919281) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() > 1.37906014919281) {
            p = WekaClassifierJ48.Nfc66a856(i);
        }
        return p;
    }
    static double Nfc66a856(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 3;
        } else if (((Double) i[2]).doubleValue() <= -6.378153324127197) {
            p = 3;
        } else if (((Double) i[2]).doubleValue() > -6.378153324127197) {
            p = 1;
        }
        return p;
    }
    static double Na4c99657(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 6.512228488922119) {
            p = WekaClassifierJ48.N1ed156258(i);
        } else if (((Double) i[1]).doubleValue() > 6.512228488922119) {
            p = WekaClassifierJ48.N4170f459(i);
        }
        return p;
    }
    static double N1ed156258(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 7.450755596160889) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 7.450755596160889) {
            p = 4;
        }
        return p;
    }
    static double N4170f459(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.09800432622432709) {
            p = WekaClassifierJ48.N1bd807260(i);
        } else if (((Double) i[8]).doubleValue() > 0.09800432622432709) {
            p = 1;
        }
        return p;
    }
    static double N1bd807260(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.7046716213226318) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.7046716213226318) {
            p = 0;
        }
        return p;
    }
    static double N1af082a61(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -6.4164605140686035) {
            p = WekaClassifierJ48.N304db862(i);
        } else if (((Double) i[0]).doubleValue() > -6.4164605140686035) {
            p = WekaClassifierJ48.N13b5a7965(i);
        }
        return p;
    }
    static double N304db862(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.12357068061828613) {
            p = WekaClassifierJ48.N105465a63(i);
        } else if (((Double) i[6]).doubleValue() > 0.12357068061828613) {
            p = 1;
        }
        return p;
    }
    static double N105465a63(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.03834952041506767) {
            p = WekaClassifierJ48.N9aeb9864(i);
        } else if (((Double) i[6]).doubleValue() > -0.03834952041506767) {
            p = 0;
        }
        return p;
    }
    static double N9aeb9864(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 5.746084213256836) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 5.746084213256836) {
            p = 1;
        }
        return p;
    }
    static double N13b5a7965(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.7795141935348511) {
            p = WekaClassifierJ48.N10a842b66(i);
        } else if (((Double) i[14]).doubleValue() > -0.7795141935348511) {
            p = WekaClassifierJ48.Na260667(i);
        }
        return p;
    }
    static double N10a842b66(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() <= -1.3464943170547485) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() > -1.3464943170547485) {
            p = 0;
        }
        return p;
    }
    static double Na260667(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 49.05759048461914) {
            p = WekaClassifierJ48.N127ceb468(i);
        } else if (((Double) i[10]).doubleValue() > 49.05759048461914) {
            p = 1;
        }
        return p;
    }
    static double N127ceb468(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -74.9021987915039) {
            p = WekaClassifierJ48.N66ac3b69(i);
        } else if (((Double) i[10]).doubleValue() > -74.9021987915039) {
            p = WekaClassifierJ48.N3d2079115(i);
        }
        return p;
    }
    static double N66ac3b69(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 3.7300076484680176) {
            p = WekaClassifierJ48.N106568070(i);
        } else if (((Double) i[11]).doubleValue() > 3.7300076484680176) {
            p = WekaClassifierJ48.N11b236696(i);
        }
        return p;
    }
    static double N106568070(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.9054747819900513) {
            p = WekaClassifierJ48.N457eb071(i);
        } else if (((Double) i[7]).doubleValue() > 0.9054747819900513) {
            p = 1;
        }
        return p;
    }
    static double N457eb071(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.9331716895103455) {
            p = WekaClassifierJ48.N1ea496272(i);
        } else if (((Double) i[7]).doubleValue() > -0.9331716895103455) {
            p = WekaClassifierJ48.N113d51074(i);
        }
        return p;
    }
    static double N1ea496272(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -0.9118663668632507) {
            p = WekaClassifierJ48.Nb22e9073(i);
        } else if (((Double) i[8]).doubleValue() > -0.9118663668632507) {
            p = 1;
        }
        return p;
    }
    static double Nb22e9073(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 4.865017890930176) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 4.865017890930176) {
            p = 1;
        }
        return p;
    }
    static double N113d51074(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 317.5241394042969) {
            p = WekaClassifierJ48.Nd0867c75(i);
        } else if (((Double) i[9]).doubleValue() > 317.5241394042969) {
            p = WekaClassifierJ48.N25135d92(i);
        }
        return p;
    }
    static double Nd0867c75(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.4725685715675354) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 0.4725685715675354) {
            p = WekaClassifierJ48.N1866d1d76(i);
        }
        return p;
    }
    static double N1866d1d76(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= 0.542522132396698) {
            p = WekaClassifierJ48.N2b089377(i);
        } else if (((Double) i[13]).doubleValue() > 0.542522132396698) {
            p = WekaClassifierJ48.N9b8cf189(i);
        }
        return p;
    }
    static double N2b089377(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -0.28943175077438354) {
            p = WekaClassifierJ48.N1e7e61378(i);
        } else if (((Double) i[14]).doubleValue() > -0.28943175077438354) {
            p = WekaClassifierJ48.N17c34e987(i);
        }
        return p;
    }
    static double N1e7e61378(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -0.31107378005981445) {
            p = WekaClassifierJ48.N11a6d3579(i);
        } else if (((Double) i[4]).doubleValue() > -0.31107378005981445) {
            p = 1;
        }
        return p;
    }
    static double N11a6d3579(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -0.26875007152557373) {
            p = WekaClassifierJ48.N1aa0b4e80(i);
        } else if (((Double) i[13]).doubleValue() > -0.26875007152557373) {
            p = 0;
        }
        return p;
    }
    static double N1aa0b4e80(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -0.3921450972557068) {
            p = WekaClassifierJ48.N19bf27881(i);
        } else if (((Double) i[14]).doubleValue() > -0.3921450972557068) {
            p = 1;
        }
        return p;
    }
    static double N19bf27881(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 82.41226959228516) {
            p = WekaClassifierJ48.N10256e682(i);
        } else if (((Double) i[9]).doubleValue() > 82.41226959228516) {
            p = 1;
        }
        return p;
    }
    static double N10256e682(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -104.17505645751953) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -104.17505645751953) {
            p = WekaClassifierJ48.N1cde43683(i);
        }
        return p;
    }
    static double N1cde43683(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.09800432622432709) {
            p = WekaClassifierJ48.N5c7cba84(i);
        } else if (((Double) i[7]).doubleValue() > -0.09800432622432709) {
            p = WekaClassifierJ48.Ne4597b85(i);
        }
        return p;
    }
    static double N5c7cba84(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -94.42658233642578) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -94.42658233642578) {
            p = 1;
        }
        return p;
    }
    static double Ne4597b85(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -0.8302452564239502) {
            p = WekaClassifierJ48.N162836786(i);
        } else if (((Double) i[5]).doubleValue() > -0.8302452564239502) {
            p = 0;
        }
        return p;
    }
    static double N162836786(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.43885380029678345) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -0.43885380029678345) {
            p = 1;
        }
        return p;
    }
    static double N17c34e987(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 8.316648483276367) {
            p = WekaClassifierJ48.Nda305088(i);
        } else if (((Double) i[9]).doubleValue() > 8.316648483276367) {
            p = 1;
        }
        return p;
    }
    static double Nda305088(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.2522754669189453) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 1.2522754669189453) {
            p = 1;
        }
        return p;
    }
    static double N9b8cf189(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.15322890877723694) {
            p = WekaClassifierJ48.N18951be90(i);
        } else if (((Double) i[2]).doubleValue() > 0.15322890877723694) {
            p = 1;
        }
        return p;
    }
    static double N18951be90(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 6.071695327758789) {
            p = WekaClassifierJ48.N13ee4da91(i);
        } else if (((Double) i[1]).doubleValue() > 6.071695327758789) {
            p = 0;
        }
        return p;
    }
    static double N13ee4da91(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 0.029827404767274857) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 0.029827404767274857) {
            p = 0;
        }
        return p;
    }
    static double N25135d92(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() <= 0.6136327981948853) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() > 0.6136327981948853) {
            p = WekaClassifierJ48.Nf9fcac93(i);
        }
        return p;
    }
    static double Nf9fcac93(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.015180018730461597) {
            p = WekaClassifierJ48.N1204aac94(i);
        } else if (((Double) i[7]).doubleValue() > 0.015180018730461597) {
            p = 1;
        }
        return p;
    }
    static double N1204aac94(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 2.6414785385131836) {
            p = WekaClassifierJ48.N1346ee695(i);
        } else if (((Double) i[3]).doubleValue() > 2.6414785385131836) {
            p = 1;
        }
        return p;
    }
    static double N1346ee695(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.47510793805122375) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -0.47510793805122375) {
            p = 0;
        }
        return p;
    }
    static double N11b236696(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 137.076416015625) {
            p = WekaClassifierJ48.N50b87597(i);
        } else if (((Double) i[9]).doubleValue() > 137.076416015625) {
            p = WekaClassifierJ48.N5362bd101(i);
        }
        return p;
    }
    static double N50b87597(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.101978302001953) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 8.101978302001953) {
            p = WekaClassifierJ48.N162f63998(i);
        }
        return p;
    }
    static double N162f63998(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.012809310108423233) {
            p = WekaClassifierJ48.N1cbf2ad99(i);
        } else if (((Double) i[14]).doubleValue() > 0.012809310108423233) {
            p = 0;
        }
        return p;
    }
    static double N1cbf2ad99(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.3064578175544739) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > 0.3064578175544739) {
            p = WekaClassifierJ48.N1cbe5a1100(i);
        }
        return p;
    }
    static double N1cbe5a1100(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.5283711552619934) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -0.5283711552619934) {
            p = 2;
        }
        return p;
    }
    static double N5362bd101(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.15366315841674805) {
            p = WekaClassifierJ48.N5e8ab0102(i);
        } else if (((Double) i[4]).doubleValue() > -0.15366315841674805) {
            p = WekaClassifierJ48.N8f290d111(i);
        }
        return p;
    }
    static double N5e8ab0102(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -3.1318774223327637) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -3.1318774223327637) {
            p = WekaClassifierJ48.N7c504c103(i);
        }
        return p;
    }
    static double N7c504c103(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= 0.7020271420478821) {
            p = WekaClassifierJ48.Ne64a4f104(i);
        } else if (((Double) i[13]).doubleValue() > 0.7020271420478821) {
            p = WekaClassifierJ48.N1f7475f110(i);
        }
        return p;
    }
    static double Ne64a4f104(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.948749542236328) {
            p = WekaClassifierJ48.N11398a4105(i);
        } else if (((Double) i[1]).doubleValue() > 7.948749542236328) {
            p = WekaClassifierJ48.Nf3a7cc109(i);
        }
        return p;
    }
    static double N11398a4105(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.8990831971168518) {
            p = WekaClassifierJ48.N11a91bc106(i);
        } else if (((Double) i[7]).doubleValue() > 0.8990831971168518) {
            p = WekaClassifierJ48.N1fcd4af108(i);
        }
        return p;
    }
    static double N11a91bc106(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 2.0877439975738525) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 2.0877439975738525) {
            p = WekaClassifierJ48.N18c5723107(i);
        }
        return p;
    }
    static double N18c5723107(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -2.200836420059204) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -2.200836420059204) {
            p = 1;
        }
        return p;
    }
    static double N1fcd4af108(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -0.5844454765319824) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -0.5844454765319824) {
            p = 1;
        }
        return p;
    }
    static double Nf3a7cc109(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.02130528911948204) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 0.02130528911948204) {
            p = 2;
        }
        return p;
    }
    static double N1f7475f110(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -1.7621324062347412) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -1.7621324062347412) {
            p = 2;
        }
        return p;
    }
    static double N8f290d111(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.8271110653877258) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -0.8271110653877258) {
            p = WekaClassifierJ48.N1dbc19f112(i);
        }
        return p;
    }
    static double N1dbc19f112(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 12.113066673278809) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > 12.113066673278809) {
            p = WekaClassifierJ48.Nb9d7af113(i);
        }
        return p;
    }
    static double Nb9d7af113(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= 0.2534348964691162) {
            p = WekaClassifierJ48.N16fac98114(i);
        } else if (((Double) i[13]).doubleValue() > 0.2534348964691162) {
            p = 0;
        }
        return p;
    }
    static double N16fac98114(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -0.14864550530910492) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -0.14864550530910492) {
            p = 1;
        }
        return p;
    }
    static double N3d2079115(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 7.833827972412109) {
            p = WekaClassifierJ48.N1d5d6d8116(i);
        } else if (((Double) i[1]).doubleValue() > 7.833827972412109) {
            p = WekaClassifierJ48.N157ac41120(i);
        }
        return p;
    }
    static double N1d5d6d8116(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= -0.05210493877530098) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() > -0.05210493877530098) {
            p = WekaClassifierJ48.N1516222117(i);
        }
        return p;
    }
    static double N1516222117(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -6.364053726196289) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -6.364053726196289) {
            p = WekaClassifierJ48.N1720a3c118(i);
        }
        return p;
    }
    static double N1720a3c118(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 265.3643798828125) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 265.3643798828125) {
            p = WekaClassifierJ48.N65d643119(i);
        }
        return p;
    }
    static double N65d643119(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 337.204345703125) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 337.204345703125) {
            p = 0;
        }
        return p;
    }
    static double N157ac41120(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 0.9959878921508789) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 0.9959878921508789) {
            p = 2;
        }
        return p;
    }
    static double N1e39bfb121(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.030756410211324692) {
            p = WekaClassifierJ48.N74951122(i);
        } else if (((Double) i[14]).doubleValue() > -0.030756410211324692) {
            p = WekaClassifierJ48.N1e57a37137(i);
        }
        return p;
    }
    static double N74951122(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 5.666553624905646E-4) {
            p = WekaClassifierJ48.N80535c123(i);
        } else if (((Double) i[12]).doubleValue() > 5.666553624905646E-4) {
            p = WekaClassifierJ48.N1dcaf55125(i);
        }
        return p;
    }
    static double N80535c123(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= -4.616020679473877) {
            p = WekaClassifierJ48.N27cb29124(i);
        } else if (((Double) i[1]).doubleValue() > -4.616020679473877) {
            p = 0;
        }
        return p;
    }
    static double N27cb29124(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.5816344022750854) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > 0.5816344022750854) {
            p = 1;
        }
        return p;
    }
    static double N1dcaf55125(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -4.5759687423706055) {
            p = WekaClassifierJ48.N1b720fe126(i);
        } else if (((Double) i[11]).doubleValue() > -4.5759687423706055) {
            p = WekaClassifierJ48.N10009ce133(i);
        }
        return p;
    }
    static double N1b720fe126(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= -0.2332402616739273) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() > -0.2332402616739273) {
            p = WekaClassifierJ48.N1e38ee7127(i);
        }
        return p;
    }
    static double N1e38ee7127(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.15295536816120148) {
            p = WekaClassifierJ48.N17d7d71128(i);
        } else if (((Double) i[12]).doubleValue() > 0.15295536816120148) {
            p = WekaClassifierJ48.N111a386130(i);
        }
        return p;
    }
    static double N17d7d71128(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -1.975191593170166) {
            p = WekaClassifierJ48.N127ce0c129(i);
        } else if (((Double) i[5]).doubleValue() > -1.975191593170166) {
            p = 0;
        }
        return p;
    }
    static double N127ce0c129(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() <= -1.4633970260620117) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() > -1.4633970260620117) {
            p = 0;
        }
        return p;
    }
    static double N111a386130(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= -0.07679525017738342) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() > -0.07679525017738342) {
            p = WekaClassifierJ48.Ne89cb5131(i);
        }
        return p;
    }
    static double Ne89cb5131(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -11.699934005737305) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -11.699934005737305) {
            p = WekaClassifierJ48.N4efec132(i);
        }
        return p;
    }
    static double N4efec132(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -0.7733820080757141) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -0.7733820080757141) {
            p = 2;
        }
        return p;
    }
    static double N10009ce133(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.08168325573205948) {
            p = WekaClassifierJ48.N16b823b134(i);
        } else if (((Double) i[13]).doubleValue() > -0.08168325573205948) {
            p = 2;
        }
        return p;
    }
    static double N16b823b134(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 0.5013244152069092) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 0.5013244152069092) {
            p = WekaClassifierJ48.N1a4a297135(i);
        }
        return p;
    }
    static double N1a4a297135(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 2.75812029838562) {
            p = WekaClassifierJ48.N45780136(i);
        } else if (((Double) i[0]).doubleValue() > 2.75812029838562) {
            p = 0;
        }
        return p;
    }
    static double N45780136(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= -2.1375606060028076) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > -2.1375606060028076) {
            p = 1;
        }
        return p;
    }
    static double N1e57a37137(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= 0.5677413940429688) {
            p = WekaClassifierJ48.Na55aa138(i);
        } else if (((Double) i[14]).doubleValue() > 0.5677413940429688) {
            p = WekaClassifierJ48.N10942212(i);
        }
        return p;
    }
    static double Na55aa138(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() <= 0.15322890877723694) {
            p = WekaClassifierJ48.N94e266139(i);
        } else if (((Double) i[1]).doubleValue() > 0.15322890877723694) {
            p = WekaClassifierJ48.N1db022b203(i);
        }
        return p;
    }
    static double N94e266139(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() <= 0.07661445438861847) {
            p = WekaClassifierJ48.Nde1523140(i);
        } else if (((Double) i[0]).doubleValue() > 0.07661445438861847) {
            p = WekaClassifierJ48.N1a8b1ab192(i);
        }
        return p;
    }
    static double Nde1523140(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= 0.34237775206565857) {
            p = WekaClassifierJ48.Nbee50d141(i);
        } else if (((Double) i[14]).doubleValue() > 0.34237775206565857) {
            p = WekaClassifierJ48.Nfffba7190(i);
        }
        return p;
    }
    static double Nbee50d141(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 4;
        } else if (((Double) i[11]).doubleValue() <= 1.0637052059173584) {
            p = WekaClassifierJ48.Na14bf5142(i);
        } else if (((Double) i[11]).doubleValue() > 1.0637052059173584) {
            p = WekaClassifierJ48.N3dbdc0187(i);
        }
        return p;
    }
    static double Na14bf5142(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() <= 322.7901916503906) {
            p = WekaClassifierJ48.N1450515143(i);
        } else if (((Double) i[9]).doubleValue() > 322.7901916503906) {
            p = 4;
        }
        return p;
    }
    static double N1450515143(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= 0.08416798710823059) {
            p = WekaClassifierJ48.N1f46813144(i);
        } else if (((Double) i[3]).doubleValue() > 0.08416798710823059) {
            p = WekaClassifierJ48.N51209e181(i);
        }
        return p;
    }
    static double N1f46813144(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() <= -0.4203472137451172) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() > -0.4203472137451172) {
            p = WekaClassifierJ48.Nf77c6d145(i);
        }
        return p;
    }
    static double Nf77c6d145(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 4;
        } else if (((Double) i[1]).doubleValue() <= -0.3405751883983612) {
            p = WekaClassifierJ48.Nd97c25146(i);
        } else if (((Double) i[1]).doubleValue() > -0.3405751883983612) {
            p = WekaClassifierJ48.N6626aa173(i);
        }
        return p;
    }
    static double Nd97c25146(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= -0.011251155287027359) {
            p = WekaClassifierJ48.N125bbc6147(i);
        } else if (((Double) i[13]).doubleValue() > -0.011251155287027359) {
            p = WekaClassifierJ48.N18d7931154(i);
        }
        return p;
    }
    static double N125bbc6147(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= 0.3337746560573578) {
            p = WekaClassifierJ48.N14dea41148(i);
        } else if (((Double) i[14]).doubleValue() > 0.3337746560573578) {
            p = WekaClassifierJ48.N1bb1140152(i);
        }
        return p;
    }
    static double N14dea41148(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= -0.012195022776722908) {
            p = WekaClassifierJ48.N8e4d1149(i);
        } else if (((Double) i[13]).doubleValue() > -0.012195022776722908) {
            p = WekaClassifierJ48.N1c18c61150(i);
        }
        return p;
    }
    static double N8e4d1149(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= -0.014488821849226952) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() > -0.014488821849226952) {
            p = 4;
        }
        return p;
    }
    static double N1c18c61150(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 9.385271072387695) {
            p = WekaClassifierJ48.N1bce6d4151(i);
        } else if (((Double) i[2]).doubleValue() > 9.385271072387695) {
            p = 4;
        }
        return p;
    }
    static double N1bce6d4151(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 0.055393751710653305) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > 0.055393751710653305) {
            p = 4;
        }
        return p;
    }
    static double N1bb1140152(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.41158008575439453) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.41158008575439453) {
            p = WekaClassifierJ48.Nf45aca153(i);
        }
        return p;
    }
    static double Nf45aca153(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= -0.060912519693374634) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() > -0.060912519693374634) {
            p = 2;
        }
        return p;
    }
    static double N18d7931154(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() <= 321.79888916015625) {
            p = WekaClassifierJ48.N1b1abd2155(i);
        } else if (((Double) i[9]).doubleValue() > 321.79888916015625) {
            p = WekaClassifierJ48.N5efc91167(i);
        }
        return p;
    }
    static double N1b1abd2155(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -0.15552860498428345) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -0.15552860498428345) {
            p = WekaClassifierJ48.N118335156(i);
        }
        return p;
    }
    static double N118335156(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -0.016326287761330605) {
            p = WekaClassifierJ48.Nb9b177157(i);
        } else if (((Double) i[12]).doubleValue() > -0.016326287761330605) {
            p = WekaClassifierJ48.N650f60158(i);
        }
        return p;
    }
    static double Nb9b177157(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= 0.015180018730461597) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > 0.015180018730461597) {
            p = 2;
        }
        return p;
    }
    static double N650f60158(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 9.37509536743164) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() > 9.37509536743164) {
            p = WekaClassifierJ48.N42c345159(i);
        }
        return p;
    }
    static double N42c345159(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() <= -0.014320336282253265) {
            p = WekaClassifierJ48.N12e193160(i);
        } else if (((Double) i[12]).doubleValue() > -0.014320336282253265) {
            p = WekaClassifierJ48.N143d9f6162(i);
        }
        return p;
    }
    static double N12e193160(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() <= 321.3179626464844) {
            p = WekaClassifierJ48.N1b3d02f161(i);
        } else if (((Double) i[9]).doubleValue() > 321.3179626464844) {
            p = 1;
        }
        return p;
    }
    static double N1b3d02f161(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.011067390441894531) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.011067390441894531) {
            p = 4;
        }
        return p;
    }
    static double N143d9f6162(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= -0.01438106968998909) {
            p = WekaClassifierJ48.N1036f30163(i);
        } else if (((Double) i[7]).doubleValue() > -0.01438106968998909) {
            p = WekaClassifierJ48.N1b58a66165(i);
        }
        return p;
    }
    static double N1036f30163(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() <= 0.06711166352033615) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() > 0.06711166352033615) {
            p = WekaClassifierJ48.Ndc0eba164(i);
        }
        return p;
    }
    static double Ndc0eba164(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 0.04261057823896408) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > 0.04261057823896408) {
            p = 4;
        }
        return p;
    }
    static double N1b58a66165(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() <= 0.053064823150634766) {
            p = 4;
        } else if (((Double) i[3]).doubleValue() > 0.053064823150634766) {
            p = WekaClassifierJ48.Nc7acf166(i);
        }
        return p;
    }
    static double Nc7acf166(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 0.05589386820793152) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() > 0.05589386820793152) {
            p = 4;
        }
        return p;
    }
    static double N5efc91167(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 9.385271072387695) {
            p = WekaClassifierJ48.Ne59d7e168(i);
        } else if (((Double) i[2]).doubleValue() > 9.385271072387695) {
            p = WekaClassifierJ48.N15ebc5a172(i);
        }
        return p;
    }
    static double Ne59d7e168(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() <= -0.01188049465417862) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() > -0.01188049465417862) {
            p = WekaClassifierJ48.N106d57e169(i);
        }
        return p;
    }
    static double N106d57e169(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= -0.006915677338838577) {
            p = WekaClassifierJ48.N2319d3170(i);
        } else if (((Double) i[13]).doubleValue() > -0.006915677338838577) {
            p = 2;
        }
        return p;
    }
    static double N2319d3170(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= -0.0078597292304039) {
            p = WekaClassifierJ48.N1dadcb2171(i);
        } else if (((Double) i[13]).doubleValue() > -0.0078597292304039) {
            p = 4;
        }
        return p;
    }
    static double N1dadcb2171(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() <= 0.04261057823896408) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() > 0.04261057823896408) {
            p = 4;
        }
        return p;
    }
    static double N15ebc5a172(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 0.026778221130371094) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() > 0.026778221130371094) {
            p = 4;
        }
        return p;
    }
    static double N6626aa173(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 4;
        } else if (((Double) i[8]).doubleValue() <= 0.07030745595693588) {
            p = WekaClassifierJ48.Ncf4af4174(i);
        } else if (((Double) i[8]).doubleValue() > 0.07030745595693588) {
            p = WekaClassifierJ48.Nd0a192179(i);
        }
        return p;
    }
    static double Ncf4af4174(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() <= 0.05746084079146385) {
            p = 4;
        } else if (((Double) i[0]).doubleValue() > 0.05746084079146385) {
            p = WekaClassifierJ48.N1393193175(i);
        }
        return p;
    }
    static double N1393193175(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= 0.3348836302757263) {
            p = WekaClassifierJ48.N1e5f002176(i);
        } else if (((Double) i[14]).doubleValue() > 0.3348836302757263) {
            p = 1;
        }
        return p;
    }
    static double N1e5f002176(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 9.37509536743164) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() > 9.37509536743164) {
            p = WekaClassifierJ48.N87c862177(i);
        }
        return p;
    }
    static double N87c862177(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 4;
        } else if (((Double) i[8]).doubleValue() <= 0.012783173471689224) {
            p = WekaClassifierJ48.N21a1ec178(i);
        } else if (((Double) i[8]).doubleValue() > 0.012783173471689224) {
            p = 1;
        }
        return p;
    }
    static double N21a1ec178(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= -0.008115793578326702) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() > -0.008115793578326702) {
            p = 1;
        }
        return p;
    }
    static double Nd0a192179(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() <= 0.10439591854810715) {
            p = WekaClassifierJ48.N7730aa180(i);
        } else if (((Double) i[8]).doubleValue() > 0.10439591854810715) {
            p = 1;
        }
        return p;
    }
    static double N7730aa180(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= -0.006391586735844612) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() > -0.006391586735844612) {
            p = 2;
        }
        return p;
    }
    static double N51209e181(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.33204618096351624) {
            p = WekaClassifierJ48.N190df79182(i);
        } else if (((Double) i[14]).doubleValue() > 0.33204618096351624) {
            p = WekaClassifierJ48.N1a33c9185(i);
        }
        return p;
    }
    static double N190df79182(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() <= -0.01887737400829792) {
            p = 4;
        } else if (((Double) i[12]).doubleValue() > -0.01887737400829792) {
            p = WekaClassifierJ48.N6f3fe8183(i);
        }
        return p;
    }
    static double N6f3fe8183(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= -0.01156927365809679) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > -0.01156927365809679) {
            p = WekaClassifierJ48.N140a46f184(i);
        }
        return p;
    }
    static double N140a46f184(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() <= 322.06524658203125) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() > 322.06524658203125) {
            p = 1;
        }
        return p;
    }
    static double N1a33c9185(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() <= 320.5857849121094) {
            p = 4;
        } else if (((Double) i[9]).doubleValue() > 320.5857849121094) {
            p = WekaClassifierJ48.N19e5ca4186(i);
        }
        return p;
    }
    static double N19e5ca4186(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() <= 9.37509536743164) {
            p = 4;
        } else if (((Double) i[2]).doubleValue() > 9.37509536743164) {
            p = 2;
        }
        return p;
    }
    static double N3dbdc0187(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 321.6378173828125) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 321.6378173828125) {
            p = WekaClassifierJ48.Ncc0af4188(i);
        }
        return p;
    }
    static double Ncc0af4188(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 2;
        } else if (((Double) i[10]).doubleValue() <= 1.6263526678085327) {
            p = 2;
        } else if (((Double) i[10]).doubleValue() > 1.6263526678085327) {
            p = WekaClassifierJ48.N101ef9f189(i);
        }
        return p;
    }
    static double N101ef9f189(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 322.3597106933594) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 322.3597106933594) {
            p = 4;
        }
        return p;
    }
    static double Nfffba7190(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() <= -0.008522115647792816) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() > -0.008522115647792816) {
            p = WekaClassifierJ48.N1859685191(i);
        }
        return p;
    }
    static double N1859685191(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= -4.884171485900879) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > -4.884171485900879) {
            p = 0;
        }
        return p;
    }
    static double N1a8b1ab192(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= 0.33551737666130066) {
            p = WekaClassifierJ48.N145db96193(i);
        } else if (((Double) i[14]).doubleValue() > 0.33551737666130066) {
            p = WekaClassifierJ48.N1548e88202(i);
        }
        return p;
    }
    static double N145db96193(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 0.8044517636299133) {
            p = WekaClassifierJ48.N82285a194(i);
        } else if (((Double) i[0]).doubleValue() > 0.8044517636299133) {
            p = 1;
        }
        return p;
    }
    static double N82285a194(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() <= -0.4209918975830078) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() > -0.4209918975830078) {
            p = WekaClassifierJ48.N12ca971195(i);
        }
        return p;
    }
    static double N12ca971195(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 9.404424667358398) {
            p = WekaClassifierJ48.N14978d6196(i);
        } else if (((Double) i[2]).doubleValue() > 9.404424667358398) {
            p = WekaClassifierJ48.N191acda201(i);
        }
        return p;
    }
    static double N14978d6196(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= -0.01201399601995945) {
            p = WekaClassifierJ48.N6b9fc2197(i);
        } else if (((Double) i[12]).doubleValue() > -0.01201399601995945) {
            p = 2;
        }
        return p;
    }
    static double N6b9fc2197(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.32732775807380676) {
            p = WekaClassifierJ48.N1caa5ed198(i);
        } else if (((Double) i[14]).doubleValue() > 0.32732775807380676) {
            p = WekaClassifierJ48.N127ed04199(i);
        }
        return p;
    }
    static double N1caa5ed198(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.41280364990234375) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.41280364990234375) {
            p = 4;
        }
        return p;
    }
    static double N127ed04199(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() <= 0.04436004161834717) {
            p = WekaClassifierJ48.N14cb5fe200(i);
        } else if (((Double) i[4]).doubleValue() > 0.04436004161834717) {
            p = 2;
        }
        return p;
    }
    static double N14cb5fe200(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() <= 0.022156015038490295) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() > 0.022156015038490295) {
            p = 1;
        }
        return p;
    }
    static double N191acda201(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 4;
        } else if (((Double) i[8]).doubleValue() <= 0.06817692518234253) {
            p = 4;
        } else if (((Double) i[8]).doubleValue() > 0.06817692518234253) {
            p = 2;
        }
        return p;
    }
    static double N1548e88202(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() <= 0.08309062570333481) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() > 0.08309062570333481) {
            p = 1;
        }
        return p;
    }
    static double N1db022b203(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 2.7964274883270264) {
            p = WekaClassifierJ48.N146b2eb204(i);
        } else if (((Double) i[1]).doubleValue() > 2.7964274883270264) {
            p = WekaClassifierJ48.N16f20e5205(i);
        }
        return p;
    }
    static double N146b2eb204(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.43249738216400146) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.43249738216400146) {
            p = 2;
        }
        return p;
    }
    static double N16f20e5205(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 0.2298433631658554) {
            p = WekaClassifierJ48.N98ccce206(i);
        } else if (((Double) i[0]).doubleValue() > 0.2298433631658554) {
            p = WekaClassifierJ48.N937ee0211(i);
        }
        return p;
    }
    static double N98ccce206(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.3558945655822754) {
            p = WekaClassifierJ48.N139442c207(i);
        } else if (((Double) i[0]).doubleValue() > -2.3558945655822754) {
            p = WekaClassifierJ48.N1106aca208(i);
        }
        return p;
    }
    static double N139442c207(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -7.067683219909668) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -7.067683219909668) {
            p = 0;
        }
        return p;
    }
    static double N1106aca208(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.6072007417678833) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -0.6072007417678833) {
            p = WekaClassifierJ48.N11200c5209(i);
        }
        return p;
    }
    static double N11200c5209(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.044741109013557434) {
            p = WekaClassifierJ48.N1ee4515210(i);
        } else if (((Double) i[7]).doubleValue() > -0.044741109013557434) {
            p = 3;
        }
        return p;
    }
    static double N1ee4515210(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 3;
        } else if (((Double) i[0]).doubleValue() <= -0.47884035110473633) {
            p = 3;
        } else if (((Double) i[0]).doubleValue() > -0.47884035110473633) {
            p = 1;
        }
        return p;
    }
    static double N937ee0211(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -32.501651763916016) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() > -32.501651763916016) {
            p = 2;
        }
        return p;
    }
    static double N10942212(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 8.1973876953125) {
            p = WekaClassifierJ48.N1b8246f213(i);
        } else if (((Double) i[10]).doubleValue() > 8.1973876953125) {
            p = 3;
        }
        return p;
    }
    static double N1b8246f213(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 256.00115966796875) {
            p = WekaClassifierJ48.N330be0214(i);
        } else if (((Double) i[9]).doubleValue() > 256.00115966796875) {
            p = 2;
        }
        return p;
    }
    static double N330be0214(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= -0.08708751946687698) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() > -0.08708751946687698) {
            p = 0;
        }
        return p;
    }
    static double N1961cb8215(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 62.742881774902344) {
            p = WekaClassifierJ48.N15b5b11216(i);
        } else if (((Double) i[11]).doubleValue() > 62.742881774902344) {
            p = WekaClassifierJ48.Nc13f8d223(i);
        }
        return p;
    }
    static double N15b5b11216(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= 49.788665771484375) {
            p = WekaClassifierJ48.N1229909217(i);
        } else if (((Double) i[10]).doubleValue() > 49.788665771484375) {
            p = WekaClassifierJ48.Nd44f55219(i);
        }
        return p;
    }
    static double N1229909217(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 9.078812599182129) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 9.078812599182129) {
            p = WekaClassifierJ48.N1b8e786218(i);
        }
        return p;
    }
    static double N1b8e786218(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 55.95480728149414) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 55.95480728149414) {
            p = 4;
        }
        return p;
    }
    static double Nd44f55219(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 37.86454772949219) {
            p = WekaClassifierJ48.N1a41bcd220(i);
        } else if (((Double) i[11]).doubleValue() > 37.86454772949219) {
            p = WekaClassifierJ48.N913a21221(i);
        }
        return p;
    }
    static double N1a41bcd220(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 3;
        } else if (((Double) i[5]).doubleValue() <= -3.29905366897583) {
            p = 3;
        } else if (((Double) i[5]).doubleValue() > -3.29905366897583) {
            p = 1;
        }
        return p;
    }
    static double N913a21221(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= -0.5636226534843445) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > -0.5636226534843445) {
            p = WekaClassifierJ48.Nef68a2222(i);
        }
        return p;
    }
    static double Nef68a2222(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 1.9919757843017578) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 1.9919757843017578) {
            p = 4;
        }
        return p;
    }
    static double Nc13f8d223(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.32964083552360535) {
            p = WekaClassifierJ48.N14a38ab224(i);
        } else if (((Double) i[13]).doubleValue() > -0.32964083552360535) {
            p = WekaClassifierJ48.N1a8889a226(i);
        }
        return p;
    }
    static double N14a38ab224(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.6834409236907959) {
            p = WekaClassifierJ48.N8d5a11225(i);
        } else if (((Double) i[14]).doubleValue() > -0.6834409236907959) {
            p = 0;
        }
        return p;
    }
    static double N8d5a11225(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 2.3942017555236816) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 2.3942017555236816) {
            p = 4;
        }
        return p;
    }
    static double N1a8889a226(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 4;
        } else if (((Double) i[14]).doubleValue() <= -0.6438577771186829) {
            p = WekaClassifierJ48.Ne8f3f5227(i);
        } else if (((Double) i[14]).doubleValue() > -0.6438577771186829) {
            p = WekaClassifierJ48.N868976229(i);
        }
        return p;
    }
    static double Ne8f3f5227(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() <= 4.01604700088501) {
            p = 4;
        } else if (((Double) i[7]).doubleValue() > 4.01604700088501) {
            p = WekaClassifierJ48.Nb30223228(i);
        }
        return p;
    }
    static double Nb30223228(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 4;
        } else if (((Double) i[4]).doubleValue() <= -0.5832004547119141) {
            p = 4;
        } else if (((Double) i[4]).doubleValue() > -0.5832004547119141) {
            p = 0;
        }
        return p;
    }
    static double N868976229(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= 1.4163576364517212) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > 1.4163576364517212) {
            p = 4;
        }
        return p;
    }
    static double N1a33424230(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 9.097966194152832) {
            p = WekaClassifierJ48.N63083e231(i);
        } else if (((Double) i[1]).doubleValue() > 9.097966194152832) {
            p = WekaClassifierJ48.N13b9a84367(i);
        }
        return p;
    }
    static double N63083e231(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.28730419278144836) {
            p = WekaClassifierJ48.N7db64b232(i);
        } else if (((Double) i[0]).doubleValue() > -0.28730419278144836) {
            p = WekaClassifierJ48.N1e5327d277(i);
        }
        return p;
    }
    static double N7db64b232(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -31.764259338378906) {
            p = WekaClassifierJ48.Nc853cb233(i);
        } else if (((Double) i[10]).doubleValue() > -31.764259338378906) {
            p = WekaClassifierJ48.N14003b275(i);
        }
        return p;
    }
    static double Nc853cb233(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -97.61880493164062) {
            p = WekaClassifierJ48.N565b22234(i);
        } else if (((Double) i[10]).doubleValue() > -97.61880493164062) {
            p = WekaClassifierJ48.N121eb4a242(i);
        }
        return p;
    }
    static double N565b22234(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 0.9387943744659424) {
            p = WekaClassifierJ48.N5e8cae235(i);
        } else if (((Double) i[5]).doubleValue() > 0.9387943744659424) {
            p = 1;
        }
        return p;
    }
    static double N5e8cae235(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.509196400642395) {
            p = WekaClassifierJ48.N1f2a500236(i);
        } else if (((Double) i[7]).doubleValue() > 0.509196400642395) {
            p = 1;
        }
        return p;
    }
    static double N1f2a500236(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -1.031175971031189) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -1.031175971031189) {
            p = WekaClassifierJ48.N110fcbe237(i);
        }
        return p;
    }
    static double N110fcbe237(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.3004045784473419) {
            p = WekaClassifierJ48.N1472a35238(i);
        } else if (((Double) i[6]).doubleValue() > 0.3004045784473419) {
            p = 1;
        }
        return p;
    }
    static double N1472a35238(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -0.20240025222301483) {
            p = WekaClassifierJ48.N1c8e48f239(i);
        } else if (((Double) i[8]).doubleValue() > -0.20240025222301483) {
            p = WekaClassifierJ48.N1a48453240(i);
        }
        return p;
    }
    static double N1c8e48f239(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 273.4794921875) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 273.4794921875) {
            p = 0;
        }
        return p;
    }
    static double N1a48453240(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.34667909145355225) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -0.34667909145355225) {
            p = WekaClassifierJ48.N1417455241(i);
        }
        return p;
    }
    static double N1417455241(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 0.6936807632446289) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > 0.6936807632446289) {
            p = 1;
        }
        return p;
    }
    static double N121eb4a242(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.9002198576927185) {
            p = WekaClassifierJ48.N1719e3d243(i);
        } else if (((Double) i[0]).doubleValue() > -0.9002198576927185) {
            p = WekaClassifierJ48.N733727257(i);
        }
        return p;
    }
    static double N1719e3d243(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -16.068716049194336) {
            p = WekaClassifierJ48.N9e169c244(i);
        } else if (((Double) i[11]).doubleValue() > -16.068716049194336) {
            p = WekaClassifierJ48.N74e332246(i);
        }
        return p;
    }
    static double N9e169c244(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.5797111392021179) {
            p = WekaClassifierJ48.N2b36c6245(i);
        } else if (((Double) i[12]).doubleValue() > 0.5797111392021179) {
            p = 4;
        }
        return p;
    }
    static double N2b36c6245(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -2.049436569213867) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -2.049436569213867) {
            p = 1;
        }
        return p;
    }
    static double N74e332246(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.732283353805542) {
            p = WekaClassifierJ48.N1ef04f7247(i);
        } else if (((Double) i[12]).doubleValue() > 0.732283353805542) {
            p = WekaClassifierJ48.N105a538256(i);
        }
        return p;
    }
    static double N1ef04f7247(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.8569688200950623) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.8569688200950623) {
            p = WekaClassifierJ48.N1cbca60248(i);
        }
        return p;
    }
    static double N1cbca60248(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.4748282432556152) {
            p = WekaClassifierJ48.Na74299249(i);
        } else if (((Double) i[0]).doubleValue() > -1.4748282432556152) {
            p = WekaClassifierJ48.Nc62dfb251(i);
        }
        return p;
    }
    static double Na74299249(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -1.5446335077285767) {
            p = WekaClassifierJ48.N1e151cc250(i);
        } else if (((Double) i[6]).doubleValue() > -1.5446335077285767) {
            p = 1;
        }
        return p;
    }
    static double N1e151cc250(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.75812029838562) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.75812029838562) {
            p = 0;
        }
        return p;
    }
    static double Nc62dfb251(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= -0.6772454380989075) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() > -0.6772454380989075) {
            p = WekaClassifierJ48.N1996ac9252(i);
        }
        return p;
    }
    static double N1996ac9252(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 87.15492248535156) {
            p = WekaClassifierJ48.N1785ea9253(i);
        } else if (((Double) i[9]).doubleValue() > 87.15492248535156) {
            p = 1;
        }
        return p;
    }
    static double N1785ea9253(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.4162429869174957) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -0.4162429869174957) {
            p = WekaClassifierJ48.N5e077b254(i);
        }
        return p;
    }
    static double N5e077b254(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -2.60331392288208) {
            p = WekaClassifierJ48.N16a557e255(i);
        } else if (((Double) i[11]).doubleValue() > -2.60331392288208) {
            p = 1;
        }
        return p;
    }
    static double N16a557e255(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 0.2874937057495117) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() > 0.2874937057495117) {
            p = 1;
        }
        return p;
    }
    static double N105a538256(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 13.781133651733398) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 13.781133651733398) {
            p = 1;
        }
        return p;
    }
    static double N733727257(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= -0.6764496564865112) {
            p = WekaClassifierJ48.N969b4d258(i);
        } else if (((Double) i[13]).doubleValue() > -0.6764496564865112) {
            p = WekaClassifierJ48.N1e8f944259(i);
        }
        return p;
    }
    static double N969b4d258(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.71489429473877) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 8.71489429473877) {
            p = 2;
        }
        return p;
    }
    static double N1e8f944259(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 16.582210540771484) {
            p = WekaClassifierJ48.N1a4a124260(i);
        } else if (((Double) i[9]).doubleValue() > 16.582210540771484) {
            p = WekaClassifierJ48.N417938261(i);
        }
        return p;
    }
    static double N1a4a124260(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 8.868123054504395) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() > 8.868123054504395) {
            p = 0;
        }
        return p;
    }
    static double N417938261(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.6008091568946838) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.6008091568946838) {
            p = WekaClassifierJ48.N8fde4e262(i);
        }
        return p;
    }
    static double N8fde4e262(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 68.72370910644531) {
            p = WekaClassifierJ48.N632d42263(i);
        } else if (((Double) i[9]).doubleValue() > 68.72370910644531) {
            p = WekaClassifierJ48.N14729ea265(i);
        }
        return p;
    }
    static double N632d42263(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 43.67652893066406) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 43.67652893066406) {
            p = WekaClassifierJ48.N210ab264(i);
        }
        return p;
    }
    static double N210ab264(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.22075891494750977) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.22075891494750977) {
            p = 2;
        }
        return p;
    }
    static double N14729ea265(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -5.745145797729492) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -5.745145797729492) {
            p = WekaClassifierJ48.N100eb62266(i);
        }
        return p;
    }
    static double N100eb62266(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 8.523358345031738) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() > 8.523358345031738) {
            p = WekaClassifierJ48.N9ac93d267(i);
        }
        return p;
    }
    static double N9ac93d267(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -0.7992676496505737) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -0.7992676496505737) {
            p = WekaClassifierJ48.N4b028d268(i);
        }
        return p;
    }
    static double N4b028d268(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.29827404022216797) {
            p = WekaClassifierJ48.Nf17d97269(i);
        } else if (((Double) i[6]).doubleValue() > 0.29827404022216797) {
            p = WekaClassifierJ48.N1bcbac2274(i);
        }
        return p;
    }
    static double Nf17d97269(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.44315001368522644) {
            p = WekaClassifierJ48.N1cc5d0270(i);
        } else if (((Double) i[8]).doubleValue() > 0.44315001368522644) {
            p = 1;
        }
        return p;
    }
    static double N1cc5d0270(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= -2.3909361362457275) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > -2.3909361362457275) {
            p = WekaClassifierJ48.N3b39cf271(i);
        }
        return p;
    }
    static double N3b39cf271(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.13635385036468506) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.13635385036468506) {
            p = WekaClassifierJ48.N481caf272(i);
        }
        return p;
    }
    static double N481caf272(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -0.38307225704193115) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -0.38307225704193115) {
            p = WekaClassifierJ48.N118d1f4273(i);
        }
        return p;
    }
    static double N118d1f4273(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.3064578175544739) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.3064578175544739) {
            p = 2;
        }
        return p;
    }
    static double N1bcbac2274(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -90.70489501953125) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -90.70489501953125) {
            p = 0;
        }
        return p;
    }
    static double N14003b275(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.40222588181495667) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -0.40222588181495667) {
            p = WekaClassifierJ48.N51cc32276(i);
        }
        return p;
    }
    static double N51cc32276(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.091755986213684) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.091755986213684) {
            p = 0;
        }
        return p;
    }
    static double N1e5327d277(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 2;
        } else if (((Double) i[3]).doubleValue() <= 0.6727031469345093) {
            p = WekaClassifierJ48.N119eea9278(i);
        } else if (((Double) i[3]).doubleValue() > 0.6727031469345093) {
            p = WekaClassifierJ48.N1aff526357(i);
        }
        return p;
    }
    static double N119eea9278(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 2;
        } else if (((Double) i[4]).doubleValue() <= -0.34070587158203125) {
            p = WekaClassifierJ48.N1822d29279(i);
        } else if (((Double) i[4]).doubleValue() > -0.34070587158203125) {
            p = WekaClassifierJ48.N17be2d0331(i);
        }
        return p;
    }
    static double N1822d29279(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -1.7992291450500488) {
            p = WekaClassifierJ48.N1fa5ef7280(i);
        } else if (((Double) i[11]).doubleValue() > -1.7992291450500488) {
            p = WekaClassifierJ48.N3e520c286(i);
        }
        return p;
    }
    static double N1fa5ef7280(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 342.3708801269531) {
            p = WekaClassifierJ48.N140e4ef281(i);
        } else if (((Double) i[9]).doubleValue() > 342.3708801269531) {
            p = 0;
        }
        return p;
    }
    static double N140e4ef281(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= -0.6495289206504822) {
            p = WekaClassifierJ48.N19021c8282(i);
        } else if (((Double) i[14]).doubleValue() > -0.6495289206504822) {
            p = WekaClassifierJ48.N197b736283(i);
        }
        return p;
    }
    static double N19021c8282(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.08096009492874146) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.08096009492874146) {
            p = 2;
        }
        return p;
    }
    static double N197b736283(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -1.0828561782836914) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -1.0828561782836914) {
            p = WekaClassifierJ48.Nfd5915284(i);
        }
        return p;
    }
    static double Nfd5915284(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 0.13407529890537262) {
            p = WekaClassifierJ48.Ne4abb9285(i);
        } else if (((Double) i[0]).doubleValue() > 0.13407529890537262) {
            p = 1;
        }
        return p;
    }
    static double Ne4abb9285(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() <= 65.78728485107422) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() > 65.78728485107422) {
            p = 1;
        }
        return p;
    }
    static double N3e520c286(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() <= 0.7265103459358215) {
            p = WekaClassifierJ48.N8475ba287(i);
        } else if (((Double) i[7]).doubleValue() > 0.7265103459358215) {
            p = WekaClassifierJ48.Nc7363f329(i);
        }
        return p;
    }
    static double N8475ba287(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() <= 0.17470337450504303) {
            p = WekaClassifierJ48.N15ad4e288(i);
        } else if (((Double) i[6]).doubleValue() > 0.17470337450504303) {
            p = WekaClassifierJ48.N6d4241319(i);
        }
        return p;
    }
    static double N15ad4e288(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() <= -0.24714136123657227) {
            p = WekaClassifierJ48.N1b97f16289(i);
        } else if (((Double) i[6]).doubleValue() > -0.24714136123657227) {
            p = WekaClassifierJ48.N1364e8a293(i);
        }
        return p;
    }
    static double N1b97f16289(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 2;
        } else if (((Double) i[10]).doubleValue() <= -84.0654067993164) {
            p = WekaClassifierJ48.N191e91f290(i);
        } else if (((Double) i[10]).doubleValue() > -84.0654067993164) {
            p = 1;
        }
        return p;
    }
    static double N191e91f290(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -0.8824119567871094) {
            p = WekaClassifierJ48.N7b7ff2291(i);
        } else if (((Double) i[4]).doubleValue() > -0.8824119567871094) {
            p = 2;
        }
        return p;
    }
    static double N7b7ff2291(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= -1.2477350234985352) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > -1.2477350234985352) {
            p = WekaClassifierJ48.N1eddfee292(i);
        }
        return p;
    }
    static double N1eddfee292(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 8.695740699768066) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 8.695740699768066) {
            p = 2;
        }
        return p;
    }
    static double N1364e8a293(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= 0.7291367650032043) {
            p = WekaClassifierJ48.N1b78a62294(i);
        } else if (((Double) i[14]).doubleValue() > 0.7291367650032043) {
            p = WekaClassifierJ48.N193f71e318(i);
        }
        return p;
    }
    static double N1b78a62294(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -0.8619126081466675) {
            p = WekaClassifierJ48.Nfce689295(i);
        } else if (((Double) i[2]).doubleValue() > -0.8619126081466675) {
            p = WekaClassifierJ48.N12d94d7301(i);
        }
        return p;
    }
    static double Nfce689295(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() <= 225.0684051513672) {
            p = WekaClassifierJ48.N17d45d7296(i);
        } else if (((Double) i[9]).doubleValue() > 225.0684051513672) {
            p = WekaClassifierJ48.N188b7ff300(i);
        }
        return p;
    }
    static double N17d45d7296(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= 0.32188311219215393) {
            p = WekaClassifierJ48.Nea152c297(i);
        } else if (((Double) i[12]).doubleValue() > 0.32188311219215393) {
            p = WekaClassifierJ48.N521d9f299(i);
        }
        return p;
    }
    static double Nea152c297(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 1.072602391242981) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 1.072602391242981) {
            p = WekaClassifierJ48.N18d7d09298(i);
        }
        return p;
    }
    static double N18d7d09298(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= 1.9919757843017578) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > 1.9919757843017578) {
            p = 0;
        }
        return p;
    }
    static double N521d9f299(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.4910815358161926) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() > 0.4910815358161926) {
            p = 2;
        }
        return p;
    }
    static double N188b7ff300(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= 0.5990745425224304) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > 0.5990745425224304) {
            p = 2;
        }
        return p;
    }
    static double N12d94d7301(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 0.8236053586006165) {
            p = WekaClassifierJ48.N116cd4e302(i);
        } else if (((Double) i[2]).doubleValue() > 0.8236053586006165) {
            p = WekaClassifierJ48.N1424e3b315(i);
        }
        return p;
    }
    static double N116cd4e302(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 2;
        } else if (((Double) i[11]).doubleValue() <= 21.757890701293945) {
            p = WekaClassifierJ48.N11a9456303(i);
        } else if (((Double) i[11]).doubleValue() > 21.757890701293945) {
            p = WekaClassifierJ48.N147e79c314(i);
        }
        return p;
    }
    static double N11a9456303(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 2;
        } else if (((Double) i[1]).doubleValue() <= 8.983044624328613) {
            p = WekaClassifierJ48.N1c3f8c5304(i);
        } else if (((Double) i[1]).doubleValue() > 8.983044624328613) {
            p = WekaClassifierJ48.N28dd26308(i);
        }
        return p;
    }
    static double N1c3f8c5304(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 2;
        } else if (((Double) i[5]).doubleValue() <= -0.8282365798950195) {
            p = WekaClassifierJ48.N6956c6305(i);
        } else if (((Double) i[5]).doubleValue() > -0.8282365798950195) {
            p = WekaClassifierJ48.N1b09af8306(i);
        }
        return p;
    }
    static double N6956c6305(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.0751538276672363) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -1.0751538276672363) {
            p = 2;
        }
        return p;
    }
    static double N1b09af8306(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() <= 257.5008544921875) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() > 257.5008544921875) {
            p = WekaClassifierJ48.N7d1ffc307(i);
        }
        return p;
    }
    static double N7d1ffc307(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.659990668296814) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 0.659990668296814) {
            p = 2;
        }
        return p;
    }
    static double N28dd26308(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.6804053783416748) {
            p = WekaClassifierJ48.Nd37943309(i);
        } else if (((Double) i[14]).doubleValue() > -0.6804053783416748) {
            p = WekaClassifierJ48.N1fb5dbb310(i);
        }
        return p;
    }
    static double Nd37943309(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() <= -0.22157500684261322) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() > -0.22157500684261322) {
            p = 0;
        }
        return p;
    }
    static double N1fb5dbb310(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 0.40222588181495667) {
            p = WekaClassifierJ48.N12f3007311(i);
        } else if (((Double) i[0]).doubleValue() > 0.40222588181495667) {
            p = WekaClassifierJ48.N14606a9312(i);
        }
        return p;
    }
    static double N12f3007311(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -0.28730419278144836) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > -0.28730419278144836) {
            p = 0;
        }
        return p;
    }
    static double N14606a9312(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() <= 0.6456956267356873) {
            p = 2;
        } else if (((Double) i[14]).doubleValue() > 0.6456956267356873) {
            p = WekaClassifierJ48.Ne71e3313(i);
        }
        return p;
    }
    static double Ne71e3313(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 5.51162576675415) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 5.51162576675415) {
            p = 2;
        }
        return p;
    }
    static double N147e79c314(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 43.103233337402344) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 43.103233337402344) {
            p = 2;
        }
        return p;
    }
    static double N1424e3b315(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() <= 2.577436685562134) {
            p = 0;
        } else if (((Double) i[11]).doubleValue() > 2.577436685562134) {
            p = WekaClassifierJ48.N7a6834316(i);
        }
        return p;
    }
    static double N7a6834316(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() <= 0.006391586735844612) {
            p = WekaClassifierJ48.N1a29231317(i);
        } else if (((Double) i[7]).doubleValue() > 0.006391586735844612) {
            p = 2;
        }
        return p;
    }
    static double N1a29231317(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= 0.284801185131073) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() > 0.284801185131073) {
            p = 0;
        }
        return p;
    }
    static double N193f71e318(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() <= -0.017044231295585632) {
            p = 2;
        } else if (((Double) i[6]).doubleValue() > -0.017044231295585632) {
            p = 0;
        }
        return p;
    }
    static double N6d4241319(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 2;
        } else if (((Double) i[9]).doubleValue() <= 194.0714874267578) {
            p = WekaClassifierJ48.N111b8f0320(i);
        } else if (((Double) i[9]).doubleValue() > 194.0714874267578) {
            p = WekaClassifierJ48.N153c28e327(i);
        }
        return p;
    }
    static double N111b8f0320(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.8312376737594604) {
            p = WekaClassifierJ48.Nfb9079321(i);
        } else if (((Double) i[3]).doubleValue() > -0.8312376737594604) {
            p = WekaClassifierJ48.Nc8a6ff322(i);
        }
        return p;
    }
    static double Nfb9079321(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= 0.37825441360473633) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > 0.37825441360473633) {
            p = 0;
        }
        return p;
    }
    static double Nc8a6ff322(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= -0.44741106033325195) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() > -0.44741106033325195) {
            p = WekaClassifierJ48.N978a6d323(i);
        }
        return p;
    }
    static double N978a6d323(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() <= -1.2538748979568481) {
            p = 1;
        } else if (((Double) i[5]).doubleValue() > -1.2538748979568481) {
            p = WekaClassifierJ48.Nc17937324(i);
        }
        return p;
    }
    static double Nc17937324(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -96.68252563476562) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -96.68252563476562) {
            p = WekaClassifierJ48.Nb1548e325(i);
        }
        return p;
    }
    static double Nb1548e325(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 2;
        } else if (((Double) i[8]).doubleValue() <= -0.09587380290031433) {
            p = WekaClassifierJ48.N1c7f9b9326(i);
        } else if (((Double) i[8]).doubleValue() > -0.09587380290031433) {
            p = 2;
        }
        return p;
    }
    static double N1c7f9b9326(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 133.4199676513672) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 133.4199676513672) {
            p = 2;
        }
        return p;
    }
    static double N153c28e327(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 338.4161376953125) {
            p = WekaClassifierJ48.N3c1cd2328(i);
        } else if (((Double) i[9]).doubleValue() > 338.4161376953125) {
            p = 2;
        }
        return p;
    }
    static double N3c1cd2328(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 9.040505409240723) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 9.040505409240723) {
            p = 2;
        }
        return p;
    }
    static double Nc7363f329(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= -2.319855213165283) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() > -2.319855213165283) {
            p = WekaClassifierJ48.N1f0b2f330(i);
        }
        return p;
    }
    static double N1f0b2f330(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 332.2954406738281) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 332.2954406738281) {
            p = 2;
        }
        return p;
    }
    static double N17be2d0331(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 2.490735496394336E-4) {
            p = WekaClassifierJ48.N19bac21332(i);
        } else if (((Double) i[12]).doubleValue() > 2.490735496394336E-4) {
            p = WekaClassifierJ48.N10a9b84353(i);
        }
        return p;
    }
    static double N19bac21332(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 0;
        } else if (((Double) i[4]).doubleValue() <= 0.010535776615142822) {
            p = WekaClassifierJ48.Ne00b23333(i);
        } else if (((Double) i[4]).doubleValue() > 0.010535776615142822) {
            p = WekaClassifierJ48.N180227a352(i);
        }
        return p;
    }
    static double Ne00b23333(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.8863000273704529) {
            p = WekaClassifierJ48.Nb82023334(i);
        } else if (((Double) i[8]).doubleValue() > 0.8863000273704529) {
            p = 2;
        }
        return p;
    }
    static double Nb82023334(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -2.2026655673980713) {
            p = WekaClassifierJ48.Ncf3206335(i);
        } else if (((Double) i[2]).doubleValue() > -2.2026655673980713) {
            p = WekaClassifierJ48.N17725a336(i);
        }
        return p;
    }
    static double Ncf3206335(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -4.003105163574219) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -4.003105163574219) {
            p = 2;
        }
        return p;
    }
    static double N17725a336(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 8.868123054504395) {
            p = WekaClassifierJ48.N5cc2e8337(i);
        } else if (((Double) i[1]).doubleValue() > 8.868123054504395) {
            p = WekaClassifierJ48.N825cda348(i);
        }
        return p;
    }
    static double N5cc2e8337(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 0.47884035110473633) {
            p = WekaClassifierJ48.N1c84738338(i);
        } else if (((Double) i[0]).doubleValue() > 0.47884035110473633) {
            p = WekaClassifierJ48.N4776d4343(i);
        }
        return p;
    }
    static double N1c84738338(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -0.10534487664699554) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -0.10534487664699554) {
            p = WekaClassifierJ48.N181b45339(i);
        }
        return p;
    }
    static double N181b45339(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 0.7852981686592102) {
            p = WekaClassifierJ48.N1f22c3e340(i);
        } else if (((Double) i[2]).doubleValue() > 0.7852981686592102) {
            p = 0;
        }
        return p;
    }
    static double N1f22c3e340(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.06763619929552078) {
            p = WekaClassifierJ48.N179f82a341(i);
        } else if (((Double) i[2]).doubleValue() > -0.06763619929552078) {
            p = 2;
        }
        return p;
    }
    static double N179f82a341(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -0.4405331015586853) {
            p = WekaClassifierJ48.Nc18bfa342(i);
        } else if (((Double) i[2]).doubleValue() > -0.4405331015586853) {
            p = 0;
        }
        return p;
    }
    static double Nc18bfa342(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -1.1300631761550903) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -1.1300631761550903) {
            p = 2;
        }
        return p;
    }
    static double N4776d4343(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 1.5514427423477173) {
            p = WekaClassifierJ48.Nae3dfe344(i);
        } else if (((Double) i[0]).doubleValue() > 1.5514427423477173) {
            p = WekaClassifierJ48.N2f456346(i);
        }
        return p;
    }
    static double Nae3dfe344(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.008788431994616985) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.008788431994616985) {
            p = WekaClassifierJ48.Nf226e9345(i);
        }
        return p;
    }
    static double Nf226e9345(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 0.40222588181495667) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > 0.40222588181495667) {
            p = 0;
        }
        return p;
    }
    static double N2f456346(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 8.40843677520752) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 8.40843677520752) {
            p = WekaClassifierJ48.N1eec994347(i);
        }
        return p;
    }
    static double N1eec994347(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() <= 0.24714136123657227) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() > 0.24714136123657227) {
            p = 0;
        }
        return p;
    }
    static double N825cda348(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.0788295716047287) {
            p = WekaClassifierJ48.N16eeb8d349(i);
        } else if (((Double) i[6]).doubleValue() > -0.0788295716047287) {
            p = WekaClassifierJ48.Nf1672350(i);
        }
        return p;
    }
    static double N16eeb8d349(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -0.3064578175544739) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > -0.3064578175544739) {
            p = 0;
        }
        return p;
    }
    static double Nf1672350(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= 0.40222588181495667) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > 0.40222588181495667) {
            p = WekaClassifierJ48.N110dc4e351(i);
        }
        return p;
    }
    static double N110dc4e351(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= 0.6320692300796509) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > 0.6320692300796509) {
            p = 2;
        }
        return p;
    }
    static double N180227a352(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() <= 8.925583839416504) {
            p = 0;
        } else if (((Double) i[1]).doubleValue() > 8.925583839416504) {
            p = 1;
        }
        return p;
    }
    static double N10a9b84353(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= 0.1520150750875473) {
            p = WekaClassifierJ48.N1c0be91354(i);
        } else if (((Double) i[12]).doubleValue() > 0.1520150750875473) {
            p = WekaClassifierJ48.N7f14b355(i);
        }
        return p;
    }
    static double N1c0be91354(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 1.785071849822998) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > 1.785071849822998) {
            p = 2;
        }
        return p;
    }
    static double N7f14b355(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.2747361660003662) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > 0.2747361660003662) {
            p = WekaClassifierJ48.Nd28743356(i);
        }
        return p;
    }
    static double Nd28743356(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= -0.13407529890537262) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() > -0.13407529890537262) {
            p = 1;
        }
        return p;
    }
    static double N1aff526357(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.7177150845527649) {
            p = WekaClassifierJ48.N117fdb4358(i);
        } else if (((Double) i[14]).doubleValue() > 0.7177150845527649) {
            p = 0;
        }
        return p;
    }
    static double N117fdb4358(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 2.9090487957000732) {
            p = WekaClassifierJ48.N19c2f4359(i);
        } else if (((Double) i[11]).doubleValue() > 2.9090487957000732) {
            p = WekaClassifierJ48.Nb1bc37363(i);
        }
        return p;
    }
    static double N19c2f4359(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 302.1783447265625) {
            p = WekaClassifierJ48.N9fbeeb360(i);
        } else if (((Double) i[9]).doubleValue() > 302.1783447265625) {
            p = WekaClassifierJ48.N2fdf24362(i);
        }
        return p;
    }
    static double N9fbeeb360(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 80.8002700805664) {
            p = WekaClassifierJ48.Nb77b1b361(i);
        } else if (((Double) i[9]).doubleValue() > 80.8002700805664) {
            p = 1;
        }
        return p;
    }
    static double Nb77b1b361(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.4450995624065399) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -0.4450995624065399) {
            p = 1;
        }
        return p;
    }
    static double N2fdf24362(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() <= 1.217768669128418) {
            p = 0;
        } else if (((Double) i[5]).doubleValue() > 1.217768669128418) {
            p = 1;
        }
        return p;
    }
    static double Nb1bc37363(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= 0.30664074420928955) {
            p = WekaClassifierJ48.N1142fac364(i);
        } else if (((Double) i[12]).doubleValue() > 0.30664074420928955) {
            p = WekaClassifierJ48.Ndee736365(i);
        }
        return p;
    }
    static double N1142fac364(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.018880857154726982) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() > 0.018880857154726982) {
            p = 2;
        }
        return p;
    }
    static double Ndee736365(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -93.19514465332031) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > -93.19514465332031) {
            p = WekaClassifierJ48.Nade76366(i);
        }
        return p;
    }
    static double Nade76366(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= -0.49799394607543945) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() > -0.49799394607543945) {
            p = 2;
        }
        return p;
    }
    static double N13b9a84367(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 1;
        } else if (((Double) i[1]).doubleValue() <= 9.519346237182617) {
            p = WekaClassifierJ48.N1d2a080368(i);
        } else if (((Double) i[1]).doubleValue() > 9.519346237182617) {
            p = WekaClassifierJ48.Nf85094389(i);
        }
        return p;
    }
    static double N1d2a080368(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 2;
        } else if (((Double) i[13]).doubleValue() <= -0.6926143169403076) {
            p = WekaClassifierJ48.N461c1b369(i);
        } else if (((Double) i[13]).doubleValue() > -0.6926143169403076) {
            p = WekaClassifierJ48.N11dce83373(i);
        }
        return p;
    }
    static double N461c1b369(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= 0.16796554625034332) {
            p = WekaClassifierJ48.N6f898b370(i);
        } else if (((Double) i[12]).doubleValue() > 0.16796554625034332) {
            p = 1;
        }
        return p;
    }
    static double N6f898b370(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 2;
        } else if (((Double) i[7]).doubleValue() <= 1.237837314605713) {
            p = WekaClassifierJ48.N1bbc438371(i);
        } else if (((Double) i[7]).doubleValue() > 1.237837314605713) {
            p = 1;
        }
        return p;
    }
    static double N1bbc438371(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= -0.7450751066207886) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() > -0.7450751066207886) {
            p = WekaClassifierJ48.N19fadef372(i);
        }
        return p;
    }
    static double N19fadef372(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 2;
        } else if (((Double) i[11]).doubleValue() <= 16.778223037719727) {
            p = 2;
        } else if (((Double) i[11]).doubleValue() > 16.778223037719727) {
            p = 0;
        }
        return p;
    }
    static double N11dce83373(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -35.524871826171875) {
            p = WekaClassifierJ48.N18639fa374(i);
        } else if (((Double) i[10]).doubleValue() > -35.524871826171875) {
            p = WekaClassifierJ48.N176b061384(i);
        }
        return p;
    }
    static double N18639fa374(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= 0.5626929998397827) {
            p = WekaClassifierJ48.N3db5f6375(i);
        } else if (((Double) i[14]).doubleValue() > 0.5626929998397827) {
            p = WekaClassifierJ48.N133485381(i);
        }
        return p;
    }
    static double N3db5f6375(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.02689792774617672) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.02689792774617672) {
            p = WekaClassifierJ48.N3d86cb376(i);
        }
        return p;
    }
    static double N3d86cb376(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 89.89854431152344) {
            p = WekaClassifierJ48.N1933199377(i);
        } else if (((Double) i[9]).doubleValue() > 89.89854431152344) {
            p = WekaClassifierJ48.Nb51264379(i);
        }
        return p;
    }
    static double N1933199377(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -0.47767165303230286) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() > -0.47767165303230286) {
            p = WekaClassifierJ48.N17a8178378(i);
        }
        return p;
    }
    static double N17a8178378(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.4286261796951294) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() > -0.4286261796951294) {
            p = 1;
        }
        return p;
    }
    static double Nb51264379(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -111.19425201416016) {
            p = WekaClassifierJ48.N12c827380(i);
        } else if (((Double) i[10]).doubleValue() > -111.19425201416016) {
            p = 1;
        }
        return p;
    }
    static double N12c827380(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 1.0865697860717773) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > 1.0865697860717773) {
            p = 1;
        }
        return p;
    }
    static double N133485381(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 0.45519763231277466) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > 0.45519763231277466) {
            p = WekaClassifierJ48.N1911dbe382(i);
        }
        return p;
    }
    static double N1911dbe382(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 2;
        } else if (((Double) i[2]).doubleValue() <= 1.1492167711257935) {
            p = WekaClassifierJ48.N1650e9a383(i);
        } else if (((Double) i[2]).doubleValue() > 1.1492167711257935) {
            p = 0;
        }
        return p;
    }
    static double N1650e9a383(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.5713181495666504) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() > -0.5713181495666504) {
            p = 2;
        }
        return p;
    }
    static double N176b061384(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= 0.11930961906909943) {
            p = WekaClassifierJ48.N900ed6385(i);
        } else if (((Double) i[7]).doubleValue() > 0.11930961906909943) {
            p = WekaClassifierJ48.N661a30388(i);
        }
        return p;
    }
    static double N900ed6385(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.4772384762763977) {
            p = WekaClassifierJ48.N15f8097386(i);
        } else if (((Double) i[8]).doubleValue() > 0.4772384762763977) {
            p = 1;
        }
        return p;
    }
    static double N15f8097386(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.05752427875995636) {
            p = WekaClassifierJ48.N8f46b8387(i);
        } else if (((Double) i[6]).doubleValue() > -0.05752427875995636) {
            p = 0;
        }
        return p;
    }
    static double N8f46b8387(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -0.47884035110473633) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -0.47884035110473633) {
            p = 0;
        }
        return p;
    }
    static double N661a30388(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -2.2026655673980713) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -2.2026655673980713) {
            p = 2;
        }
        return p;
    }
    static double Nf85094389(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -55.20908737182617) {
            p = WekaClassifierJ48.N1142ee4390(i);
        } else if (((Double) i[10]).doubleValue() > -55.20908737182617) {
            p = WekaClassifierJ48.Na995419(i);
        }
        return p;
    }
    static double N1142ee4390(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 186.49339294433594) {
            p = WekaClassifierJ48.N15e19f8391(i);
        } else if (((Double) i[9]).doubleValue() > 186.49339294433594) {
            p = WekaClassifierJ48.Nfa5fe405(i);
        }
        return p;
    }
    static double N15e19f8391(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 1;
        } else if (((Double) i[14]).doubleValue() <= -0.3798944056034088) {
            p = WekaClassifierJ48.N14f2179392(i);
        } else if (((Double) i[14]).doubleValue() > -0.3798944056034088) {
            p = 1;
        }
        return p;
    }
    static double N14f2179392(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.5471631288528442) {
            p = WekaClassifierJ48.N11facf4393(i);
        } else if (((Double) i[12]).doubleValue() > 0.5471631288528442) {
            p = WekaClassifierJ48.Nb573e6400(i);
        }
        return p;
    }
    static double N11facf4393(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.20683351159095764) {
            p = WekaClassifierJ48.N184c57d394(i);
        } else if (((Double) i[12]).doubleValue() > 0.20683351159095764) {
            p = 1;
        }
        return p;
    }
    static double N184c57d394(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 0.24202477931976318) {
            p = WekaClassifierJ48.N4c962c395(i);
        } else if (((Double) i[4]).doubleValue() > 0.24202477931976318) {
            p = 1;
        }
        return p;
    }
    static double N4c962c395(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= -0.47400951385498047) {
            p = WekaClassifierJ48.N7e2bf5396(i);
        } else if (((Double) i[3]).doubleValue() > -0.47400951385498047) {
            p = WekaClassifierJ48.Nd84182397(i);
        }
        return p;
    }
    static double N7e2bf5396(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= 6.090848922729492) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > 6.090848922729492) {
            p = 0;
        }
        return p;
    }
    static double Nd84182397(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 3.282879590988159) {
            p = WekaClassifierJ48.N18ac689398(i);
        } else if (((Double) i[11]).doubleValue() > 3.282879590988159) {
            p = WekaClassifierJ48.N191d7a2399(i);
        }
        return p;
    }
    static double N18ac689398(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() <= -0.3628244400024414) {
            p = 0;
        } else if (((Double) i[3]).doubleValue() > -0.3628244400024414) {
            p = 1;
        }
        return p;
    }
    static double N191d7a2399(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -0.3166331648826599) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() > -0.3166331648826599) {
            p = 2;
        }
        return p;
    }
    static double Nb573e6400(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 1;
        } else if (((Double) i[12]).doubleValue() <= 0.5688725709915161) {
            p = WekaClassifierJ48.N89f0a3401(i);
        } else if (((Double) i[12]).doubleValue() > 0.5688725709915161) {
            p = 1;
        }
        return p;
    }
    static double N89f0a3401(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() <= -0.2961435317993164) {
            p = 1;
        } else if (((Double) i[7]).doubleValue() > -0.2961435317993164) {
            p = WekaClassifierJ48.N1b6db35402(i);
        }
        return p;
    }
    static double N1b6db35402(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.28122982382774353) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.28122982382774353) {
            p = WekaClassifierJ48.N253be6403(i);
        }
        return p;
    }
    static double N253be6403(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 0;
        } else if (((Double) i[10]).doubleValue() <= -87.4399642944336) {
            p = WekaClassifierJ48.N1904e07404(i);
        } else if (((Double) i[10]).doubleValue() > -87.4399642944336) {
            p = 1;
        }
        return p;
    }
    static double N1904e07404(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= 0.1257012039422989) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > 0.1257012039422989) {
            p = 1;
        }
        return p;
    }
    static double Nfa5fe405(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.13893002271652222) {
            p = WekaClassifierJ48.N18ba479406(i);
        } else if (((Double) i[14]).doubleValue() > -0.13893002271652222) {
            p = WekaClassifierJ48.N1a5da83408(i);
        }
        return p;
    }
    static double N18ba479406(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 1.6447683572769165) {
            p = WekaClassifierJ48.Nba5525407(i);
        } else if (((Double) i[6]).doubleValue() > 1.6447683572769165) {
            p = 1;
        }
        return p;
    }
    static double Nba5525407(Object []i) {
        double p = Double.NaN;
        if (i[7] == null) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() <= -0.3067961633205414) {
            p = 0;
        } else if (((Double) i[7]).doubleValue() > -0.3067961633205414) {
            p = 2;
        }
        return p;
    }
    static double N1a5da83408(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= -0.13211818039417267) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > -0.13211818039417267) {
            p = WekaClassifierJ48.N16a91c409(i);
        }
        return p;
    }
    static double N16a91c409(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 1;
        } else if (((Double) i[13]).doubleValue() <= 0.6530749797821045) {
            p = WekaClassifierJ48.Ne6794b410(i);
        } else if (((Double) i[13]).doubleValue() > 0.6530749797821045) {
            p = WekaClassifierJ48.N153f716416(i);
        }
        return p;
    }
    static double Ne6794b410(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 1;
        } else if (((Double) i[8]).doubleValue() <= 0.8223841786384583) {
            p = WekaClassifierJ48.Ne9084f411(i);
        } else if (((Double) i[8]).doubleValue() > 0.8223841786384583) {
            p = WekaClassifierJ48.N12bbf05414(i);
        }
        return p;
    }
    static double Ne9084f411(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= -86.60773468017578) {
            p = WekaClassifierJ48.N187a7d3412(i);
        } else if (((Double) i[10]).doubleValue() > -86.60773468017578) {
            p = 1;
        }
        return p;
    }
    static double N187a7d3412(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 295.2772521972656) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 295.2772521972656) {
            p = WekaClassifierJ48.Nceafb6413(i);
        }
        return p;
    }
    static double Nceafb6413(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() <= 353.1778564453125) {
            p = 1;
        } else if (((Double) i[9]).doubleValue() > 353.1778564453125) {
            p = 2;
        }
        return p;
    }
    static double N12bbf05414(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= 1.1270498037338257) {
            p = WekaClassifierJ48.N12e60df415(i);
        } else if (((Double) i[6]).doubleValue() > 1.1270498037338257) {
            p = 0;
        }
        return p;
    }
    static double N12e60df415(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -1.5744608640670776) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -1.5744608640670776) {
            p = 1;
        }
        return p;
    }
    static double N153f716416(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 2;
        } else if (((Double) i[12]).doubleValue() <= 0.10807497054338455) {
            p = WekaClassifierJ48.N7b5215417(i);
        } else if (((Double) i[12]).doubleValue() > 0.10807497054338455) {
            p = WekaClassifierJ48.Nd20c48418(i);
        }
        return p;
    }
    static double N7b5215417(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() <= -1.455674648284912) {
            p = 0;
        } else if (((Double) i[0]).doubleValue() > -1.455674648284912) {
            p = 2;
        }
        return p;
    }
    static double Nd20c48418(Object []i) {
        double p = Double.NaN;
        if (i[4] == null) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() <= 0.8044573068618774) {
            p = 1;
        } else if (((Double) i[4]).doubleValue() > 0.8044573068618774) {
            p = 0;
        }
        return p;
    }
    static double Na995419(Object []i) {
        double p = Double.NaN;
        if (i[3] == null) {
            p = 1;
        } else if (((Double) i[3]).doubleValue() <= 0.0655527114868164) {
            p = WekaClassifierJ48.N390f04420(i);
        } else if (((Double) i[3]).doubleValue() > 0.0655527114868164) {
            p = 0;
        }
        return p;
    }
    static double N390f04420(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 1;
        } else if (((Double) i[2]).doubleValue() <= 0.2106897532939911) {
            p = WekaClassifierJ48.Nde0e6c421(i);
        } else if (((Double) i[2]).doubleValue() > 0.2106897532939911) {
            p = 1;
        }
        return p;
    }
    static double Nde0e6c421(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() <= -1.436521053314209) {
            p = 1;
        } else if (((Double) i[0]).doubleValue() > -1.436521053314209) {
            p = WekaClassifierJ48.N52e373422(i);
        }
        return p;
    }
    static double N52e373422(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() <= -0.3579288721084595) {
            p = 1;
        } else if (((Double) i[6]).doubleValue() > -0.3579288721084595) {
            p = 0;
        }
        return p;
    }
    static double N14db86d423(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.17505496740341187) {
            p = WekaClassifierJ48.N140caaf424(i);
        } else if (((Double) i[14]).doubleValue() > -0.17505496740341187) {
            p = WekaClassifierJ48.Na76028443(i);
        }
        return p;
    }
    static double N140caaf424(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 0;
        } else if (((Double) i[13]).doubleValue() <= 0.6715840697288513) {
            p = WekaClassifierJ48.N1951cc5425(i);
        } else if (((Double) i[13]).doubleValue() > 0.6715840697288513) {
            p = WekaClassifierJ48.N11cbbe2442(i);
        }
        return p;
    }
    static double N1951cc5425(Object []i) {
        double p = Double.NaN;
        if (i[12] == null) {
            p = 0;
        } else if (((Double) i[12]).doubleValue() <= 0.6779466271400452) {
            p = WekaClassifierJ48.Nff34bf426(i);
        } else if (((Double) i[12]).doubleValue() > 0.6779466271400452) {
            p = WekaClassifierJ48.N13bbd3f433(i);
        }
        return p;
    }
    static double Nff34bf426(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.8863000273704529) {
            p = WekaClassifierJ48.Nfb741d427(i);
        } else if (((Double) i[6]).doubleValue() > 0.8863000273704529) {
            p = WekaClassifierJ48.N18a5479432(i);
        }
        return p;
    }
    static double Nfb741d427(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.17781251668930054) {
            p = WekaClassifierJ48.N143dc5f428(i);
        } else if (((Double) i[14]).doubleValue() > -0.17781251668930054) {
            p = WekaClassifierJ48.Ne2d19e431(i);
        }
        return p;
    }
    static double N143dc5f428(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 160.17202758789062) {
            p = WekaClassifierJ48.N4b8146429(i);
        } else if (((Double) i[9]).doubleValue() > 160.17202758789062) {
            p = 0;
        }
        return p;
    }
    static double N4b8146429(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() <= -0.27483823895454407) {
            p = 0;
        } else if (((Double) i[8]).doubleValue() > -0.27483823895454407) {
            p = WekaClassifierJ48.N11802bc430(i);
        }
        return p;
    }
    static double N11802bc430(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() <= -2.279279947280884) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() > -2.279279947280884) {
            p = 4;
        }
        return p;
    }
    static double Ne2d19e431(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() <= -1.6663644313812256) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() > -1.6663644313812256) {
            p = 0;
        }
        return p;
    }
    static double N18a5479432(Object []i) {
        double p = Double.NaN;
        if (i[11] == null) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() <= 48.2692985534668) {
            p = 1;
        } else if (((Double) i[11]).doubleValue() > 48.2692985534668) {
            p = 0;
        }
        return p;
    }
    static double N13bbd3f433(Object []i) {
        double p = Double.NaN;
        if (i[14] == null) {
            p = 0;
        } else if (((Double) i[14]).doubleValue() <= -0.4961038827896118) {
            p = WekaClassifierJ48.N5355c6434(i);
        } else if (((Double) i[14]).doubleValue() > -0.4961038827896118) {
            p = WekaClassifierJ48.N199add3436(i);
        }
        return p;
    }
    static double N5355c6434(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= 0.3064171075820923) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() > 0.3064171075820923) {
            p = WekaClassifierJ48.N2f1173435(i);
        }
        return p;
    }
    static double N2f1173435(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() <= -0.6773147583007812) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() > -0.6773147583007812) {
            p = 0;
        }
        return p;
    }
    static double N199add3436(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 4;
        } else if (((Double) i[13]).doubleValue() <= 0.5031029582023621) {
            p = WekaClassifierJ48.N1ab201a437(i);
        } else if (((Double) i[13]).doubleValue() > 0.5031029582023621) {
            p = 0;
        }
        return p;
    }
    static double N1ab201a437(Object []i) {
        double p = Double.NaN;
        if (i[5] == null) {
            p = 4;
        } else if (((Double) i[5]).doubleValue() <= 0.04147005081176758) {
            p = WekaClassifierJ48.N194be0c438(i);
        } else if (((Double) i[5]).doubleValue() > 0.04147005081176758) {
            p = 4;
        }
        return p;
    }
    static double N194be0c438(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() <= -0.0788295716047287) {
            p = 4;
        } else if (((Double) i[6]).doubleValue() > -0.0788295716047287) {
            p = WekaClassifierJ48.N1028d04439(i);
        }
        return p;
    }
    static double N1028d04439(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= 0.1022653877735138) {
            p = WekaClassifierJ48.N1ed5742440(i);
        } else if (((Double) i[6]).doubleValue() > 0.1022653877735138) {
            p = WekaClassifierJ48.N12a1715441(i);
        }
        return p;
    }
    static double N1ed5742440(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 4;
        } else if (((Double) i[10]).doubleValue() <= 178.28790283203125) {
            p = 4;
        } else if (((Double) i[10]).doubleValue() > 178.28790283203125) {
            p = 0;
        }
        return p;
    }
    static double N12a1715441(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() <= 297.97515869140625) {
            p = 0;
        } else if (((Double) i[9]).doubleValue() > 297.97515869140625) {
            p = 4;
        }
        return p;
    }
    static double N11cbbe2442(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -7.757213592529297) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -7.757213592529297) {
            p = 3;
        }
        return p;
    }
    static double Na76028443(Object []i) {
        double p = Double.NaN;
        if (i[13] == null) {
            p = 3;
        } else if (((Double) i[13]).doubleValue() <= 0.4466671645641327) {
            p = WekaClassifierJ48.N1477679444(i);
        } else if (((Double) i[13]).doubleValue() > 0.4466671645641327) {
            p = WekaClassifierJ48.N1ff555f454(i);
        }
        return p;
    }
    static double N1477679444(Object []i) {
        double p = Double.NaN;
        if (i[1] == null) {
            p = 3;
        } else if (((Double) i[1]).doubleValue() <= -0.13407529890537262) {
            p = WekaClassifierJ48.N344b7b445(i);
        } else if (((Double) i[1]).doubleValue() > -0.13407529890537262) {
            p = WekaClassifierJ48.N127fdb6453(i);
        }
        return p;
    }
    static double N344b7b445(Object []i) {
        double p = Double.NaN;
        if (i[2] == null) {
            p = 0;
        } else if (((Double) i[2]).doubleValue() <= -9.442731857299805) {
            p = WekaClassifierJ48.Nf12fb4446(i);
        } else if (((Double) i[2]).doubleValue() > -9.442731857299805) {
            p = WekaClassifierJ48.N15ea5e2447(i);
        }
        return p;
    }
    static double Nf12fb4446(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 3;
        } else if (((Double) i[10]).doubleValue() <= 169.12010192871094) {
            p = 3;
        } else if (((Double) i[10]).doubleValue() > 169.12010192871094) {
            p = 0;
        }
        return p;
    }
    static double N15ea5e2447(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 3;
        } else if (((Double) i[8]).doubleValue() <= 0.5475459098815918) {
            p = WekaClassifierJ48.N114e24e448(i);
        } else if (((Double) i[8]).doubleValue() > 0.5475459098815918) {
            p = WekaClassifierJ48.N41461e452(i);
        }
        return p;
    }
    static double N114e24e448(Object []i) {
        double p = Double.NaN;
        if (i[8] == null) {
            p = 3;
        } else if (((Double) i[8]).doubleValue() <= -0.2641855776309967) {
            p = WekaClassifierJ48.N1bd0404449(i);
        } else if (((Double) i[8]).doubleValue() > -0.2641855776309967) {
            p = 3;
        }
        return p;
    }
    static double N1bd0404449(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 3;
        } else if (((Double) i[9]).doubleValue() <= 307.07861328125) {
            p = WekaClassifierJ48.Nda0548450(i);
        } else if (((Double) i[9]).doubleValue() > 307.07861328125) {
            p = 1;
        }
        return p;
    }
    static double Nda0548450(Object []i) {
        double p = Double.NaN;
        if (i[6] == null) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() <= -0.3281014561653137) {
            p = 0;
        } else if (((Double) i[6]).doubleValue() > -0.3281014561653137) {
            p = WekaClassifierJ48.N35de04451(i);
        }
        return p;
    }
    static double N35de04451(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 3;
        } else if (((Double) i[10]).doubleValue() <= 168.30580139160156) {
            p = 3;
        } else if (((Double) i[10]).doubleValue() > 168.30580139160156) {
            p = 0;
        }
        return p;
    }
    static double N41461e452(Object []i) {
        double p = Double.NaN;
        if (i[9] == null) {
            p = 3;
        } else if (((Double) i[9]).doubleValue() <= 252.11520385742188) {
            p = 3;
        } else if (((Double) i[9]).doubleValue() > 252.11520385742188) {
            p = 1;
        }
        return p;
    }
    static double N127fdb6453(Object []i) {
        double p = Double.NaN;
        if (i[10] == null) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() <= 153.1092529296875) {
            p = 1;
        } else if (((Double) i[10]).doubleValue() > 153.1092529296875) {
            p = 0;
        }
        return p;
    }
    static double N1ff555f454(Object []i) {
        double p = Double.NaN;
        if (i[0] == null) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() <= -8.561665534973145) {
            p = 2;
        } else if (((Double) i[0]).doubleValue() > -8.561665534973145) {
            p = 0;
        }
        return p;
    }
}