---
title: "Create servicePrincipal"
description: "Create a new servicePrincipal object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create servicePrincipal
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [servicePrincipal](../resources/serviceprincipal.md) object.

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
POST /servicePrincipals
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [servicePrincipal](../resources/serviceprincipal.md) object.

You can specify the following properties when creating a **servicePrincipal**.

|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md). Optional.|
|accountEnabled|Boolean|**TODO: Add Description** Optional.|
|addIns|[Microsoft.DirectoryServices.addIn](../resources/addin.md) collection|**TODO: Add Description** Required.|
|alternativeNames|String collection|**TODO: Add Description** Required.|
|appDisplayName|String|**TODO: Add Description** Optional.|
|appDescription|String|**TODO: Add Description** Optional.|
|appId|String|**TODO: Add Description** Optional.|
|applicationTemplateId|String|**TODO: Add Description** Optional.|
|appOwnerOrganizationId|Guid|**TODO: Add Description** Optional.|
|appRoleAssignmentRequired|Boolean|**TODO: Add Description** Required.|
|appRoles|[Microsoft.DirectoryServices.appRole](../resources/approle.md) collection|**TODO: Add Description** Required.|
|description|String|**TODO: Add Description** Optional.|
|disabledByMicrosoftStatus|String|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Optional.|
|homepage|String|**TODO: Add Description** Optional.|
|hasPermissionClassifications|Boolean|**TODO: Add Description** Optional.|
|info|[Microsoft.DirectoryServices.informationalUrl](../resources/informationalurl.md)|**TODO: Add Description** Optional.|
|keyCredentials|[Microsoft.DirectoryServices.keyCredential](../resources/keycredential.md) collection|**TODO: Add Description** Required.|
|loginUrl|String|**TODO: Add Description** Optional.|
|logoutUrl|String|**TODO: Add Description** Optional.|
|notes|String|**TODO: Add Description** Optional.|
|notificationEmailAddresses|String collection|**TODO: Add Description** Required.|
|oauth2PermissionScopes|[Microsoft.DirectoryServices.permissionScope](../resources/permissionscope.md) collection|**TODO: Add Description** Required.|
|passwordCredentials|[Microsoft.DirectoryServices.passwordCredential](../resources/passwordcredential.md) collection|**TODO: Add Description** Required.|
|preferredTokenSigningKeyThumbprint|String|**TODO: Add Description** Optional.|
|preferredSingleSignOnMode|String|**TODO: Add Description** Optional.|
|replyUrls|String collection|**TODO: Add Description** Required.|
|servicePrincipalNames|String collection|**TODO: Add Description** Required.|
|samlSingleSignOnSettings|[Microsoft.DirectoryServices.samlSingleSignOnSettings](../resources/samlsinglesignonsettings.md)|**TODO: Add Description** Optional.|
|servicePrincipalType|String|**TODO: Add Description** Optional.|
|signInAudience|String|**TODO: Add Description** Optional.|
|tags|String collection|**TODO: Add Description** Required.|
|tokenEncryptionKeyId|Guid|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [servicePrincipal](../resources/serviceprincipal.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_serviceprincipal_from_serviceprincipals"
}
-->
``` http
POST https://graph.microsoft.com/beta/servicePrincipals
Content-Type: application/json
Content-length: 1660

{
  "@odata.type": "#Microsoft.DirectoryServices.servicePrincipal",
  "deletedDateTime": "String (timestamp)",
  "accountEnabled": "Boolean",
  "addIns": [
    {
      "@odata.type": "microsoft.graph.addIn"
    }
  ],
  "alternativeNames": [
    "String"
  ],
  "appDisplayName": "String",
  "appDescription": "String",
  "appId": "String",
  "applicationTemplateId": "String",
  "appOwnerOrganizationId": "Guid",
  "appRoleAssignmentRequired": "Boolean",
  "appRoles": [
    {
      "@odata.type": "microsoft.graph.appRole"
    }
  ],
  "description": "String",
  "disabledByMicrosoftStatus": "String",
  "displayName": "String",
  "homepage": "String",
  "hasPermissionClassifications": "Boolean",
  "info": {
    "@odata.type": "microsoft.graph.informationalUrl"
  },
  "keyCredentials": [
    {
      "@odata.type": "microsoft.graph.keyCredential"
    }
  ],
  "loginUrl": "String",
  "logoutUrl": "String",
  "notes": "String",
  "notificationEmailAddresses": [
    "String"
  ],
  "oauth2PermissionScopes": [
    {
      "@odata.type": "microsoft.graph.permissionScope"
    }
  ],
  "passwordCredentials": [
    {
      "@odata.type": "microsoft.graph.passwordCredential"
    }
  ],
  "preferredTokenSigningKeyThumbprint": "String",
  "preferredSingleSignOnMode": "String",
  "replyUrls": [
    "String"
  ],
  "servicePrincipalNames": [
    "String"
  ],
  "samlSingleSignOnSettings": {
    "@odata.type": "microsoft.graph.samlSingleSignOnSettings"
  },
  "servicePrincipalType": "String",
  "signInAudience": "String",
  "tags": [
    "String"
  ],
  "tokenEncryptionKeyId": "Guid"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.servicePrincipal"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.servicePrincipal",
  "id": "c45fdf5c-df5c-c45f-5cdf-5fc45cdf5fc4",
  "deletedDateTime": "String (timestamp)",
  "accountEnabled": "Boolean",
  "addIns": [
    {
      "@odata.type": "microsoft.graph.addIn"
    }
  ],
  "alternativeNames": [
    "String"
  ],
  "appDisplayName": "String",
  "appDescription": "String",
  "appId": "String",
  "applicationTemplateId": "String",
  "appOwnerOrganizationId": "Guid",
  "appRoleAssignmentRequired": "Boolean",
  "appRoles": [
    {
      "@odata.type": "microsoft.graph.appRole"
    }
  ],
  "description": "String",
  "disabledByMicrosoftStatus": "String",
  "displayName": "String",
  "homepage": "String",
  "hasPermissionClassifications": "Boolean",
  "info": {
    "@odata.type": "microsoft.graph.informationalUrl"
  },
  "keyCredentials": [
    {
      "@odata.type": "microsoft.graph.keyCredential"
    }
  ],
  "loginUrl": "String",
  "logoutUrl": "String",
  "notes": "String",
  "notificationEmailAddresses": [
    "String"
  ],
  "oauth2PermissionScopes": [
    {
      "@odata.type": "microsoft.graph.permissionScope"
    }
  ],
  "passwordCredentials": [
    {
      "@odata.type": "microsoft.graph.passwordCredential"
    }
  ],
  "preferredTokenSigningKeyThumbprint": "String",
  "preferredSingleSignOnMode": "String",
  "replyUrls": [
    "String"
  ],
  "servicePrincipalNames": [
    "String"
  ],
  "samlSingleSignOnSettings": {
    "@odata.type": "microsoft.graph.samlSingleSignOnSettings"
  },
  "servicePrincipalType": "String",
  "signInAudience": "String",
  "tags": [
    "String"
  ],
  "tokenEncryptionKeyId": "Guid"
}
```

