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
public class ApplePay extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2585610504008799148L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ApplePay\",\"namespace\":\"sn.academy.food_delivery.models.avro\",\"fields\":[{\"name\":\"accountNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ApplePay> ENCODER =
      new BinaryMessageEncoder<ApplePay>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ApplePay> DECODER =
      new BinaryMessageDecoder<ApplePay>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ApplePay> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ApplePay> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ApplePay> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ApplePay>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ApplePay to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ApplePay from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ApplePay instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ApplePay fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence accountNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ApplePay() {}

  /**
   * All-args constructor.
   * @param accountNumber The new value for accountNumber
   */
  public ApplePay(java.lang.CharSequence accountNumber) {
    this.accountNumber = accountNumber;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accountNumber;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accountNumber = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'accountNumber' field.
   * @return The value of the 'accountNumber' field.
   */
  public java.lang.CharSequence getAccountNumber() {
    return accountNumber;
  }


  /**
   * Sets the value of the 'accountNumber' field.
   * @param value the value to set.
   */
  public void setAccountNumber(java.lang.CharSequence value) {
    this.accountNumber = value;
  }

  /**
   * Creates a new ApplePay RecordBuilder.
   * @return A new ApplePay RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.ApplePay.Builder newBuilder() {
    return new sn.academy.food_delivery.models.avro.ApplePay.Builder();
  }

  /**
   * Creates a new ApplePay RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ApplePay RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.ApplePay.Builder newBuilder(sn.academy.food_delivery.models.avro.ApplePay.Builder other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.ApplePay.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.ApplePay.Builder(other);
    }
  }

  /**
   * Creates a new ApplePay RecordBuilder by copying an existing ApplePay instance.
   * @param other The existing instance to copy.
   * @return A new ApplePay RecordBuilder
   */
  public static sn.academy.food_delivery.models.avro.ApplePay.Builder newBuilder(sn.academy.food_delivery.models.avro.ApplePay other) {
    if (other == null) {
      return new sn.academy.food_delivery.models.avro.ApplePay.Builder();
    } else {
      return new sn.academy.food_delivery.models.avro.ApplePay.Builder(other);
    }
  }

  /**
   * RecordBuilder for ApplePay instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ApplePay>
    implements org.apache.avro.data.RecordBuilder<ApplePay> {

    private java.lang.CharSequence accountNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.ApplePay.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accountNumber)) {
        this.accountNumber = data().deepCopy(fields()[0].schema(), other.accountNumber);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing ApplePay instance
     * @param other The existing instance to copy.
     */
    private Builder(sn.academy.food_delivery.models.avro.ApplePay other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.accountNumber)) {
        this.accountNumber = data().deepCopy(fields()[0].schema(), other.accountNumber);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'accountNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountNumber() {
      return accountNumber;
    }


    /**
      * Sets the value of the 'accountNumber' field.
      * @param value The value of 'accountNumber'.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.ApplePay.Builder setAccountNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.accountNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'accountNumber' field has been set.
      * @return True if the 'accountNumber' field has been set, false otherwise.
      */
    public boolean hasAccountNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'accountNumber' field.
      * @return This builder.
      */
    public sn.academy.food_delivery.models.avro.ApplePay.Builder clearAccountNumber() {
      accountNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ApplePay build() {
      try {
        ApplePay record = new ApplePay();
        record.accountNumber = fieldSetFlags()[0] ? this.accountNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ApplePay>
    WRITER$ = (org.apache.avro.io.DatumWriter<ApplePay>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ApplePay>
    READER$ = (org.apache.avro.io.DatumReader<ApplePay>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.accountNumber);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.accountNumber = in.readString(this.accountNumber instanceof Utf8 ? (Utf8)this.accountNumber : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.accountNumber = in.readString(this.accountNumber instanceof Utf8 ? (Utf8)this.accountNumber : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










