﻿using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Soap;
using System.Runtime.Serialization.Json;
using System.Xml.Serialization;

namespace SerializaztionWithCore
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //JSONSerialize();
            //JSONDeserialize();
            SOAPSerialize();
            SOAPDeserialize();
        }

        private static void JSONSerialize()
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            DataContractJsonSerializer js = new DataContractJsonSerializer(typeof(Class1));
            Stream s = new FileStream("C:\\o.json", FileMode.Create);
            js.WriteObject(s, o);
            s.Close();
        }
        private static void JSONDeserialize()
        {
            DataContractJsonSerializer js = new DataContractJsonSerializer(typeof(Class1));
            Stream s = new FileStream("C:\\o.json", FileMode.Open);
            Class1 o = (Class1)js.ReadObject(s);
            s.Close();
            Console.WriteLine(o.i);
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2);

        }
        private static void SOAPSerialize()
        {
            Class1 o = new Class1();
            o.i = 100;
            o.P1 = "aaa";
            o.P2 = 200;
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream("C:\\o.soap", FileMode.Create);
            sf.Serialize(s, o);
            s.Close();
        }
        private static void SOAPDeserialize()
        {
            SoapFormatter sf = new SoapFormatter();
            Stream s = new FileStream("C:\\o.soap", FileMode.Open);
            Class1 o = (Class1)sf.Deserialize(s);
            s.Close();
            Console.WriteLine(o.i);
            Console.WriteLine(o.P1);
            Console.WriteLine(o.P2);
        }
    }

    [Serializable]
    public class Class1// : ISerializable
    {
        private int private_data;
        public int i;
        [XmlElement]
        public string P1
        {
            get;
            set;
        }
        private int mP2;
        [XmlAttribute]
        public int P2
        {
            get { return mP2; }
            set { mP2 = value; }
        }
        //public Class1()
        //{

        //}
        //public Class1(SerializationInfo info, StreamingContext context)
        //{
        //    this.i = (int)info.GetValue("i", typeof(int));
        //    private_data = (int)info.GetValue("private_data", typeof(int));
        //}

        //public void GetObjectData(SerializationInfo info, StreamingContext context)
        //{
        //    info.AddValue("i", this.i);
        //    info.AddValue("private_data", private_data);

        //}
    }
}
