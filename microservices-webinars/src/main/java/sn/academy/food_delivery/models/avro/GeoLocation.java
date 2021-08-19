/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package sn.academy.food_delivery.models.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GeoLocation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3353595952490287343L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeoLocation\",\"namespace\":\"sn.academy.food_delivery.models.avro\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeoLocation> ENCODER =
      new BinaryMessageEncoder<GeoLocation>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeoLocation> DECODER =
      new BinaryMessageDecoder<GeoLocation>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GeoLocation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GeoLocation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GeoLocation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeoLocation>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GeoLocation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GeoLocation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GeoLocation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GeoLocation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public double latitude;
  @Deprecated public double longitude;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeoLocation() {}

  /**
   * All-args constructor.
   * @param latitude The new value for latitude
   * @param longitude The new value for longitude
   */
  public GeoLocation(java.lang.Double latitude, java.lang.Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return latitude;
    case 1: return longitude;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: latitude = (java.lang.Double)value$; break;
    case 1: longitude = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'latitude' field.
   * @return The value of the 'latitude' field.
   */
  public double getLatitude() {
    return latitude;
  }


  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * @return The value of the 'longitude' field.
   */
  public double getLongitude() {
    return longitude;
  }


  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(double value) {
    this.longitude = value;
  }

  /**
   * Creates a new GeoLocation RecordBuilder.
   * @return A new GeoLocation RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.GeoLocation.Builder newBuilder() {
    return new sn.academy.food_delivery.models.avro.GeoLocation.Builder();
  }

  /**
   * Creates a new GeoLocation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeoLocation RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.GeoLocation.Builder newBuilder(sn.academy.food_delivery.models.avro.GeoLocation.Builder other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.GeoLocation.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.GeoLocation.Builder(other);
    }
  }

  /**
   * Creates a new GeoLocation RecordBuilder by copying an existing GeoLocation instance.
   * @param other The existing instance to copy.
   * @return A new GeoLocation RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.GeoLocation.Builder newBuilder(sn.academy.food_delivery.models.avro.GeoLocation other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.GeoLocation.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.GeoLocation.Builder(other);
    }
  }

  /**
   * RecordBuilder for GeoLocation instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeoLocation>
    implements org.apache.avro.data.RecordBuilder<GeoLocation> {

    private double latitude;
    private double longitude;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.GeoLocation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.latitude)) {
        this.latitude = data().deepCopy(fields()[0].schema(), other.latitude);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.longitude)) {
        this.longitude = data().deepCopy(fields()[1].schema(), other.longitude);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GeoLocation instance
     * @param other The existing instance to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.GeoLocation other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.latitude)) {
        this.latitude = data().deepCopy(fields()[0].schema(), other.latitude);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.longitude)) {
        this.longitude = data().deepCopy(fields()[1].schema(), other.longitude);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'latitude' field.
      * @return The value.
      */
    public double getLatitude() {
      return latitude;
    }


    /**
      * Sets the value of the 'latitude' field.
      * @param value The value of 'latitude'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.GeoLocation.Builder setLatitude(double value) {
      validate(fields()[0], value);
      this.latitude = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'latitude' field has been set.
      * @return True if the 'latitude' field has been set, false otherwise.
      */
    public boolean hasLatitude() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'latitude' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.GeoLocation.Builder clearLatitude() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'longitude' field.
      * @return The value.
      */
    public double getLongitude() {
      return longitude;
    }


    /**
      * Sets the value of the 'longitude' field.
      * @param value The value of 'longitude'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.GeoLocation.Builder setLongitude(double value) {
      validate(fields()[1], value);
      this.longitude = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'longitude' field has been set.
      * @return True if the 'longitude' field has been set, false otherwise.
      */
    public boolean hasLongitude() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'longitude' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.GeoLocation.Builder clearLongitude() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeoLocation build() {
      try {
        GeoLocation record = new GeoLocation();
        record.latitude = fieldSetFlags()[0] ? this.latitude : (java.lang.Double) defaultValue(fields()[0]);
        record.longitude = fieldSetFlags()[1] ? this.longitude : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeoLocation>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeoLocation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeoLocation>
    READER$ = (org.apache.avro.io.DatumReader<GeoLocation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeDouble(this.latitude);

    out.writeDouble(this.longitude);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.latitude = in.readDouble();

      this.longitude = in.readDouble();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.latitude = in.readDouble();
          break;

        case 1:
          this.longitude = in.readDouble();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










