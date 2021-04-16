---
title: "Update notificationMessageTemplate"
description: "Update the properties of a notificationMessageTemplate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update notificationMessageTemplate
Namespace: microsoft.graph



Update the properties of a [notificationMessageTemplate](../resources/notificationmessagetemplate.md) object.

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
PATCH /deviceManagement/notificationMessageTemplates/{notificationMessageTemplateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [notificationMessageTemplate](../resources/notificationmessagetemplate.md) object.

The following table shows the properties that are required when you update the [notificationMessageTemplate](../resources/notificationmessagetemplate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|brandingOptions|notificationTemplateBrandingOptions|The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: `none`, `includeCompanyLogo`, `includeCompanyName`, `includeContactInformation`, `includeCompanyPortalLink`.|
|defaultLocale|String|The default locale to fallback onto when the requested locale is not available.|
|displayName|String|Display name for the Notification Message Template.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|



## Response

If successful, this method returns a `200 OK` response code and an updated [notificationMessageTemplate](../resources/notificationmessagetemplate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_notificationmessagetemplate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/notificationMessageTemplates/{notificationMessageTemplateId}
Content-Type: application/json
Content-length: 203

{
  "@odata.type": "#microsoft.graph.notificationMessageTemplate",
  "brandingOptions": "String",
  "defaultLocale": "String",
  "displayName": "String",
  "roleScopeTagIds": [
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
  "@odata.type": "#microsoft.graph.notificationMessageTemplate",
  "id": "f091dc1a-dc1a-f091-1adc-91f01adc91f0",
  "brandingOptions": "String",
  "defaultLocale": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```

