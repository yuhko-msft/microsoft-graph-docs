---
title: "Update networkIPv4ConfigurationManagementCondition"
description: "Update the properties of a networkIPv4ConfigurationManagementCondition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update networkIPv4ConfigurationManagementCondition
Namespace: microsoft.graph



Update the properties of a [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH ** Entity URI for microsoft.graph.networkIPv4ConfigurationManagementCondition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.

The following table shows the properties that are required when you update the [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition. Inherited from [managementCondition](../resources/managementcondition.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|description|String|The admin defined description of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|displayName|String|The admin defined name of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|eTag|String|ETag of the management condition. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|uniqueName|String|Unique name for the management condition. Used in management condition expressions. Inherited from [managementCondition](../resources/managementcondition.md)|
|dnsSuffixList|String collection|Valid DNS suffixes for the current network. e.g. seattle.contoso.com|
|ipV4DHCPServer|String|The IPv4 address of the DHCP server for the adapter.|
|ipV4DNSServerList|String collection|The IPv4 DNS servers configured for the adapter.|
|ipV4Gateway|String|The IPv4 gateway address. e.g. 10.0.0.0|
|ipV4Prefix|String|The IPv4 subnet to be connected to. e.g. 10.0.0.0/8|



## Response

If successful, this method returns a `200 OK` response code and an updated [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_networkipv4configurationmanagementcondition"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.networkIPv4ConfigurationManagementCondition not found
Content-Type: application/json
Content-length: 411

{
  "@odata.type": "#microsoft.graph.networkIPv4ConfigurationManagementCondition",
  "applicablePlatforms": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "uniqueName": "String",
  "dnsSuffixList": [
    "String"
  ],
  "ipV4DHCPServer": "String",
  "ipV4DNSServerList": [
    "String"
  ],
  "ipV4Gateway": "String",
  "ipV4Prefix": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.networkIPv4ConfigurationManagementCondition",
  "id": "8788081f-081f-8788-1f08-88871f088887",
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "modifiedDateTime": "String (timestamp)",
  "uniqueName": "String",
  "dnsSuffixList": [
    "String"
  ],
  "ipV4DHCPServer": "String",
  "ipV4DNSServerList": [
    "String"
  ],
  "ipV4Gateway": "String",
  "ipV4Prefix": "String"
}
```

