<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\Search;

/**
 * LogQuery Class Doc Comment.
 *
 * @category Class
 */
class LogQuery extends \Algolia\AlgoliaSearch\Model\AbstractModel implements ModelInterface, \ArrayAccess, \JsonSerializable
{
    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelTypes = [
        'indexName' => 'string',
        'userToken' => 'string',
        'queryId' => 'string',
    ];

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelFormats = [
        'indexName' => null,
        'userToken' => null,
        'queryId' => null,
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'indexName' => 'index_name',
        'userToken' => 'user_token',
        'queryId' => 'query_id',
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @var string[]
     */
    protected static $setters = [
        'indexName' => 'setIndexName',
        'userToken' => 'setUserToken',
        'queryId' => 'setQueryId',
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @var string[]
     */
    protected static $getters = [
        'indexName' => 'getIndexName',
        'userToken' => 'getUserToken',
        'queryId' => 'getQueryId',
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
        if (isset($data['indexName'])) {
            $this->container['indexName'] = $data['indexName'];
        }
        if (isset($data['userToken'])) {
            $this->container['userToken'] = $data['userToken'];
        }
        if (isset($data['queryId'])) {
            $this->container['queryId'] = $data['queryId'];
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
        return [];
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
     * Gets indexName.
     *
     * @return null|string
     */
    public function getIndexName()
    {
        return $this->container['indexName'] ?? null;
    }

    /**
     * Sets indexName.
     *
     * @param null|string $indexName index targeted by the query
     *
     * @return self
     */
    public function setIndexName($indexName)
    {
        $this->container['indexName'] = $indexName;

        return $this;
    }

    /**
     * Gets userToken.
     *
     * @return null|string
     */
    public function getUserToken()
    {
        return $this->container['userToken'] ?? null;
    }

    /**
     * Sets userToken.
     *
     * @param null|string $userToken user identifier
     *
     * @return self
     */
    public function setUserToken($userToken)
    {
        $this->container['userToken'] = $userToken;

        return $this;
    }

    /**
     * Gets queryId.
     *
     * @return null|string
     */
    public function getQueryId()
    {
        return $this->container['queryId'] ?? null;
    }

    /**
     * Sets queryId.
     *
     * @param null|string $queryId unique query identifier
     *
     * @return self
     */
    public function setQueryId($queryId)
    {
        $this->container['queryId'] = $queryId;

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
