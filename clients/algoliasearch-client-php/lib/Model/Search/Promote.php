<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\Search;

/**
 * Promote Class Doc Comment.
 *
 * @category Class
 */
class Promote extends \Algolia\AlgoliaSearch\Model\AbstractModel implements ModelInterface, \ArrayAccess, \JsonSerializable
{
    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelTypes = [
        'objectIDs' => 'string[]',
        'position' => 'int',
        'objectID' => 'string',
    ];

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelFormats = [
        'objectIDs' => null,
        'position' => null,
        'objectID' => null,
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'objectIDs' => 'objectIDs',
        'position' => 'position',
        'objectID' => 'objectID',
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @var string[]
     */
    protected static $setters = [
        'objectIDs' => 'setObjectIDs',
        'position' => 'setPosition',
        'objectID' => 'setObjectID',
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @var string[]
     */
    protected static $getters = [
        'objectIDs' => 'getObjectIDs',
        'position' => 'getPosition',
        'objectID' => 'getObjectID',
    ];

    /**
     * Associative array for storing property values.
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor.
     *
     * @param mixed[] $data Associated array of property values
     */
    public function __construct(array $data = null)
    {
        if (isset($data['objectIDs'])) {
            $this->container['objectIDs'] = $data['objectIDs'];
        }
        if (isset($data['position'])) {
            $this->container['position'] = $data['position'];
        }
        if (isset($data['objectID'])) {
            $this->container['objectID'] = $data['objectID'];
        }
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @return array
     */
    public static function modelTypes()
    {
        return self::$modelTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @return array
     */
    public static function modelFormats()
    {
        return self::$modelFormats;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!isset($this->container['objectIDs']) || null === $this->container['objectIDs']) {
            $invalidProperties[] = "'objectIDs' can't be null";
        }
        if (!isset($this->container['position']) || null === $this->container['position']) {
            $invalidProperties[] = "'position' can't be null";
        }
        if (!isset($this->container['objectID']) || null === $this->container['objectID']) {
            $invalidProperties[] = "'objectID' can't be null";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed.
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return 0 === count($this->listInvalidProperties());
    }

    /**
     * Gets objectIDs.
     *
     * @return string[]
     */
    public function getObjectIDs()
    {
        return $this->container['objectIDs'] ?? null;
    }

    /**
     * Sets objectIDs.
     *
     * @param string[] $objectIDs unique identifiers of the records to promote
     *
     * @return self
     */
    public function setObjectIDs($objectIDs)
    {
        $this->container['objectIDs'] = $objectIDs;

        return $this;
    }

    /**
     * Gets position.
     *
     * @return int
     */
    public function getPosition()
    {
        return $this->container['position'] ?? null;
    }

    /**
     * Sets position.
     *
     * @param int $position The position to promote the records to. If you pass objectIDs, the records are placed at this position as a group. For example, if you pronmote four objectIDs to position 0, the records take the first four positions.
     *
     * @return self
     */
    public function setPosition($position)
    {
        $this->container['position'] = $position;

        return $this;
    }

    /**
     * Gets objectID.
     *
     * @return string
     */
    public function getObjectID()
    {
        return $this->container['objectID'] ?? null;
    }

    /**
     * Sets objectID.
     *
     * @param string $objectID unique identifier of the record to promote
     *
     * @return self
     */
    public function setObjectID($objectID)
    {
        $this->container['objectID'] = $objectID;

        return $this;
    }

    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param int $offset Offset
     *
     * @return bool
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param int $offset Offset
     *
     * @return null|mixed
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param null|int $offset Offset
     * @param mixed    $value  Value to be set
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param int $offset Offset
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }
}
