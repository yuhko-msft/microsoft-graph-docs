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

|Permission type|Permissions (from most to least privileged)|
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

The following table shows the properties that are required when you create the [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|uniqueName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|displayName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|description|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|eTag|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|applicablePlatforms|devicePlatformType collection|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|ipV4Prefix|String|**TODO: Add Description**|
|ipV4Gateway|String|**TODO: Add Description**|
|ipV4DHCPServer|String|**TODO: Add Description**|
|ipV4DNSServerList|String collection|**TODO: Add Description**|
|dnsSuffixList|String collection|**TODO: Add Description**|



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
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.networkIPv4ConfigurationManagementCondition not found
Content-Type: application/json
Content-length: 411

{
  "@odata.type": "#microsoft.graph.networkIPv4ConfigurationManagementCondition",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "ipV4Prefix": "String",
  "ipV4Gateway": "String",
  "ipV4DHCPServer": "String",
  "ipV4DNSServerList": [
    "String"
  ],
  "dnsSuffixList": [
    "String"
  ]
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
  "id": "00654579-4579-0065-7945-650079456500",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "ipV4Prefix": "String",
  "ipV4Gateway": "String",
  "ipV4DHCPServer": "String",
  "ipV4DNSServerList": [
    "String"
  ],
  "dnsSuffixList": [
    "String"
  ]
}
```

