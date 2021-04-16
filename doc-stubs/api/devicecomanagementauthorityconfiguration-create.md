---
title: "Create deviceComanagementAuthorityConfiguration"
description: "Create a new deviceComanagementAuthorityConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceComanagementAuthorityConfiguration
Namespace: microsoft.graph



Create a new [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.deviceComanagementAuthorityConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|configurationManagerAgentCommandLineArgument|String|CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument|
|installConfigurationManagerAgent|Boolean|CoManagement Authority configuration InstallConfigurationManagerAgent|
|managedDeviceAuthority|Int32|CoManagement Authority configuration ManagedDeviceAuthority|



## Response

If successful, this method returns a `201 Created` response code and a [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecomanagementauthorityconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceComanagementAuthorityConfiguration not found
Content-Type: application/json
Content-length: 384

{
  "@odata.type": "#microsoft.graph.deviceComanagementAuthorityConfiguration",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "configurationManagerAgentCommandLineArgument": "String",
  "installConfigurationManagerAgent": "Boolean",
  "managedDeviceAuthority": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceComanagementAuthorityConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceComanagementAuthorityConfiguration",
  "id": "eb988932-8932-eb98-3289-98eb328998eb",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "configurationManagerAgentCommandLineArgument": "String",
  "installConfigurationManagerAgent": "Boolean",
  "managedDeviceAuthority": "Integer"
}
```

