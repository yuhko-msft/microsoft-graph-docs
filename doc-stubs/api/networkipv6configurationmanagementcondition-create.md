---
title: "Create networkIPv6ConfigurationManagementCondition"
description: "Create a new networkIPv6ConfigurationManagementCondition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create networkIPv6ConfigurationManagementCondition
Namespace: microsoft.graph



Create a new [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.

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
POST ** Collection URI for microsoft.graph.networkIPv6ConfigurationManagementCondition not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.

The following table shows the properties that are required when you create the [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md).

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
|ipV6DNSServerList|String collection|An IPv6 DNS servers configured for the adapter.|
|ipV6Gateway|String|The IPv6 gateway address to. e.g 2001:db8::1|
|ipV6Prefix|String|The IPv6 subnet to be connected to. e.g. 2001:db8::/32|



## Response

If successful, this method returns a `201 Created` response code and a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_networkipv6configurationmanagementcondition_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.networkIPv6ConfigurationManagementCondition not found
Content-Type: application/json
Content-length: 380

{
  "@odata.type": "#microsoft.graph.networkIPv6ConfigurationManagementCondition",
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
  "ipV6DNSServerList": [
    "String"
  ],
  "ipV6Gateway": "String",
  "ipV6Prefix": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.networkIPv6ConfigurationManagementCondition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.networkIPv6ConfigurationManagementCondition",
  "id": "16066738-6738-1606-3867-061638670616",
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
  "ipV6DNSServerList": [
    "String"
  ],
  "ipV6Gateway": "String",
  "ipV6Prefix": "String"
}
```

